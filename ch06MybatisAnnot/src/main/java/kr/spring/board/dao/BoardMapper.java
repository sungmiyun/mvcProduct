package kr.spring.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.spring.board.vo.BoardVO;

public interface BoardMapper {
	
	//글쓰기
	@Insert("INSERT INTO spboard (num, writer, title, passwd, content, reg_date) VALUES (spboard_seq.nextval, #{writer}, #{title}, #{passwd}, #{content}, SYSDATE)")
	public void insertBoard(BoardVO board);

	//총 레코드 수
	public int getBoardCount();
	
	//목록
	public List<BoardVO> getBoardList(Map<String, Object> map);
	
	//글 상세
	@Select("SELECT * FROM spboard WHERE num=#{num}")
	public BoardVO getBoard(int num);
	
	//글 수정	
	@Update("UPDATE spboard SET writer=#{writer}, title=#{title}, content=#{content} WHERE num=#{num}")
	public void updateBoard(BoardVO board);
	
	//글 삭제
	@Delete("DELETE FROM spboard WHERE num=#{num}")
	public void deleteBoard(int num);
	
}
