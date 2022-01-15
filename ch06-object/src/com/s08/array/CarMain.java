package com.s08.array;

public class CarMain {
	/*
	 * [�ǽ�]
	 * �迭(carArray) ����, ���̴� 4
	 * �� ���� ������ �����ϴ� ����(total)
	 * Car ��ü 4���� �����ؼ� �迭�� ����
	 * �ݺ����� �̿��ؼ� �迭�� ����� ��ü ȣ��, �������
	 * �ݺ��� ������ total�� ������ ������
	 * �ݺ����� �������ͼ� �ڵ��� �� ���� �ݾ��� ����Ͻÿ�.
	 */
	
	public static void main(String[] args) {
		Car[] carArray = new Car[4];
		int total = 0;
		
		carArray[0] = new Car("����", "�����", 100000);
		carArray[1] = new Car("�ҳ�Ÿ", "������", 500000);
		carArray[2] = new Car("���", "������", 5000);
		carArray[3] = new Car("�׷���", "�Ķ���", 450000);
		
		for(int i = 0; i < carArray.length; i++) {
			System.out.println("name : " + carArray[i].getName());
			System.out.println("color : " + carArray[i].getColor());
			System.out.println("price : " + carArray[i].getPrice());
			
			System.out.println("---------------------");
			total += carArray[i].getPrice();
		}
		
		System.out.printf("�ڵ��� ������ �� : %,d\n", total);
		
		System.out.println("====================");
		
		//Ȯ�� for���� �̿��� �迭�� ��� ���
		for(Car car : carArray) {
			System.out.println("name : " + car.getName());
			System.out.println("color : " + car.getColor());
			System.out.println("price : " + car.getPrice());
			System.out.println("========================");
		}
		
	}
}
