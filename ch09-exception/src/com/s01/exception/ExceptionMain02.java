package com.s01.exception;

public class ExceptionMain02 {
	public static void main(String[] args) {
		//����ó���ϱ�
		int[] array = {10, 20, 30};
		for(int i = 0; i <= array.length; i++) {
			//����ó��
			//���ܰ� �߻��ص� ��������� �� �ֵ��� ���α׷������� ó���ϴ� ���� ����.
			try {
				//���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 ���
				System.out.println("array[" + i + "] : " + array[i]);
					//���� �߻��� �����Ǵ� ���� ��ü Ÿ��
			}catch(ArrayIndexOutOfBoundsException e) {
				//���ܰ�ü���� �����ϴ� ���� ���� ǥ��
				e.printStackTrace();
				//System.out.println("���� �ε��� ȣ��");
			}
		}
		System.out.println("���α׷� ��!");
		
		
	}
}
