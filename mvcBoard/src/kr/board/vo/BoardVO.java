package kr.board.vo;

import java.sql.Date;

//�ڹٺ�(VO)
public class BoardVO {
	//������Ƽ
	private int num; 		//�۹�ȣ
	private String title;	//����
	private String name;
	private String passwd; 	//��й�ȣ
	private String email;	//�̸���
	private String content;	//����
	private String ip;		//������
	private Date reg_date;	//�����
	
	//��й�ȣ ��ġ ���� üũ
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
