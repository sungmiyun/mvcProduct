package com.s07.thistest;

public class ThisMain03 {

	/*
	 * ������ ���ο��� �Ǵٸ� �����ڸ� ȣ���� �� this()�� ǥ����.
	 * this()�� �̿��ؼ� �Ǵٸ� �����ڸ� ȣ���ϴ� ���� ������ ���ο� �ݺ����� �ڵ尡 �־
	 * �ݺ����� �ڵ带 �����ϰ� �ڵ带 �����ϰ��� �� �� �����
	 */
	public ThisMain03() {
		/*
		 * this()�� ���ؼ� ������ ���ο��� �Ǵٸ� �����ڸ� ȣ���� ���� this()�� 
		 * �������� ���� ���κп� ����ؾ��ϰ� this()�� ȣ���ϱ� ���� ���๮�� ��õǸ� ���� �߻�
		 */
		//System.out.print("~~~~~~");
		this("�ٶ�~~~");
		System.out.print("+++++"); //���������� ����
	}
	
	public ThisMain03(String msg) {
		System.out.println(msg);
	}
	
	public ThisMain03(int a) {
							//int -> String ��ȯ
		this(String.valueOf(a));
	}
	
	public static void main(String[] args) {
		ThisMain03 tm = new ThisMain03();
		ThisMain03 tm2 = new ThisMain03("�ܿ�");
		ThisMain03 tm3 = new ThisMain03(123);
		
		
	}
}
