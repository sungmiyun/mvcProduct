package com.s01.exception;

public class ExceptionMain06 {
	
	//throw�� �̿��ؼ� ���������� ���� �߻� 
	public void methodA (String[] n) throws Exception {
		if(n.length > 0) { //�迭�� ����� �����Ͱ� �ִ� ���
			for(String s : n) {
				System.out.println(s);
			}
		}else { //�迭�� ����� �����Ͱ� ���� ���
			//���������� ���ܸ� �߻�
			throw new Exception("�迭�� ��Ұ� �����ϴ�.");
		
		}
	}
	
	public static void main(String[] args) {
		ExceptionMain06 em = new ExceptionMain06();
		try {
			em.methodA(args);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
