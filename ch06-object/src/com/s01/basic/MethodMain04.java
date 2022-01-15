package com.s01.basic;

public class MethodMain04 {

	//���� ���� ��� : Variable Arguments
	//�ڷ����� ��ġ�� �� �����ϰ��� �ϴ� ���� ������ �ٸ��� ������ �� �ִ�.
	//���޵Ǵ� �����ʹ� ���������� �迭�� �ν��Ѵ�.
	public void argTest(int ...n) {
		for(int i = 0; i < n.length; i++){
			System.out.println("n[" + i + "] : " + n[i]);
		}
		System.out.println("================");
	}
	
	public static void main(String[] args) {
		//��ü ���� �� ����
		MethodMain04 m = new MethodMain04();
		m.argTest();
		m.argTest(10,20);
		m.argTest(1,2,3,4,5,6,7,8,9,10);
		
		
	}

}
