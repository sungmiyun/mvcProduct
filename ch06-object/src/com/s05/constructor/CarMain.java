package com.s05.constructor;

class Car{
	String color; //����
	String gearType; //���ӱ� ���� - auto(�ڵ�), manual(����)
	int door; //���� ����
	
	//�⺻ ������, ���� ����
	public Car() {}
}

public class CarMain {

	public static void main(String[] args) {
		//��ü ���� �� ����
		Car c1 = new Car(); //�����ڴ� ������� �ʱ�ȭ
		//�����ڰ� �ʱ�ȭ�� ��������� �� ���
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);
		
		System.out.println("---------------");
		
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);
		
		//��ü�� ������
		System.out.println(c1);
		System.out.println("---------------");
		
		Car c2 = new Car();
		c2.color = "Black";
		c2.gearType = "manual";
		c2.door = 5;
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);

		System.out.println(c2);
		
		
		
	}

}
