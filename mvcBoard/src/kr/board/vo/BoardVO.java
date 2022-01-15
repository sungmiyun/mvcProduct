package kr.board.vo;

import java.sql.Date;

//자바빈(VO)
public class BoardVO {
	//프로퍼티
	private int num; 		//글번호
	private String title;	//제목
	private String name;
	private String passwd; 	//비밀번호
	private String email;	//이메일
	private String content;	//내용
	private String ip;		//아이피
	private Date reg_date;	//등록일
	
	//비밀번호 일치 여부 체크
	public boolean isCheckedPassword(String userPasswd) {
		if(passwd.equals(userPasswd)) {
			return true;
		}
		return false;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
}
