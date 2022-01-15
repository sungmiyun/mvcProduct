package kr.spring.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.board.service.BoardService;
import kr.spring.board.vo.BoardVO;
import kr.spring.util.PagingUtil;

@Controller
public class BoardController {
	//로그처리(로그 대상 지원)
	private Logger log = Logger.getLogger(this.getClass());
	/*
	 * 로그 레벨
	 * FATAL : 가장 심각한 오류
	 * ERROR : 일반적인 오류
	 * WARN : 주의를 요하는 경고
	 * INFO : 런타임시 관심있는 내용
	 * DEBUG : 시스템 흐름과 관련된 상세 정보
	 * TRACE : 가장 상세한 정보
	 * 
	 */
	
	//의존 관계 설정
	@Resource
	private BoardService boardService;
	
	//자바빈(vo) 초기화
	@ModelAttribute
	public BoardVO initCommand() {
		return new BoardVO();
	}
	
	@RequestMapping("/list.do")
	public ModelAndView getList(@RequestParam(value="pageNum", defaultValue="1") int currentPage) {
		
		//총 레코드 수
		int count = boardService.getBoardCount();
		
		if(log.isDebugEnabled()) {
			log.debug("count : " + count);
		}
		
		//페이징 처리	
		/*
		 * currentPage : 선택한 현재 번호
		 * count : 총 게시물 수
		 * rowCount : 한 페이지의 게시물의 수
		 * pageCount : 한 화면에 보여줄 페이지 수
		 * pageUrl : 호출 페이지 URL
		 */
		PagingUtil page = new PagingUtil(currentPage,  count, 10, 10, "list.do");
		
		//목록 호출
		List<BoardVO> list = null;
		if(count > 0) {
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("start", page.getStartCount());
			map.put("end", page.getEndCount());
			list = boardService.getBoardList(map);
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("selectList");
		
		//데이터 저장
		mav.addObject("count", count);
		mav.addObject("list", list);
		mav.addObject("pagingHtml", page.getPagingHtml());
		return mav;
	}
	
	//글쓰기
	@RequestMapping(value="/insert.do", method=RequestMethod.GET)
	public String form() {
		return "insertForm";
	}
	
	//글쓰기 처리
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String submit(@Valid BoardVO boardVO, BindingResult result) {
		//유효성 체크 결과 오류가 있으면 폼 호출
		if(result.hasErrors()) {
			return form();
		}
		
		//글쓰기
		boardService.insertBoard(boardVO);
		
		return "redirect:/list.do";
	}
	
	//글 상세
	@RequestMapping(value="/detail.do")
	public ModelAndView detail(@RequestParam int num) {
		BoardVO board = boardService.getBoard(num);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("selectDetail");
		mav.addObject("board", board);
		
		return mav;
	}
	
	//글 수정 폼
	@RequestMapping(value="/update.do", method=RequestMethod.GET)
	public String formUpdate(@RequestParam int num, Model model) {
		BoardVO boardVO = boardService.getBoard(num);
		//데이터 저장
		model.addAttribute("boardVO", boardVO);
		
		return "updateForm";
	}
	
	//글 수정 처리
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public String submitUpdate(@Valid BoardVO boardVO, BindingResult result) {
		//유효성 체크 결과 오류가 있으면 폼을 호출
		if(result.hasErrors()) {
			return "updateForm";
		}
		
		//비밀번호 일치 여부를 체크하기 위해서 DB에 저장된 데이터를 읽어옴
		BoardVO dbBoard = boardService.getBoard(boardVO.getNum());
		
		//비밀번호 체크
		if(!dbBoard.getPasswd().equals(boardVO.getPasswd())) {
			//비밀번호가 불일치 할 경우
			result.rejectValue("passwd", "invalidPassword");
			return "updateForm";
		}
		//글 수정 처리
		boardService.updateBoard(boardVO);
		
		return "redirect:/list.do";
	}
	
	//글 삭제 폼
	@RequestMapping(value="/delete.do", method=RequestMethod.GET)
	public String formDelete(@RequestParam int num, Model model) {
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(num);
		
		model.addAttribute("boardVO", boardVO);
		
		return "deleteForm";
	}
	
	//글 삭제 처리
	@RequestMapping(value="/delete.do", method=RequestMethod.POST)
	public String submitDelete(@Valid BoardVO boardVO, BindingResult result) {
		//유효성 체크 결과 오류가 있으면 폼을 호출
		//비밀번호가 전송되었는지만 체크
		if(result.hasFieldErrors("passwd")) {
			return "deleteForm";
		}
		//DB에 저장된 데이터를 읽어옴
		BoardVO dbBoard = boardService.getBoard(boardVO.getNum());
		
		//비밀번호 일치여부 체크
		if(!dbBoard.getPasswd().equals(boardVO.getPasswd())) {
			result.rejectValue("passwd", "invalidPassword");
			return "deleteForm";
		}
		
		//글 삭제
		boardService.deleteBoard(boardVO.getNum());
		
		return "redirect:/list.do";
	}
}
