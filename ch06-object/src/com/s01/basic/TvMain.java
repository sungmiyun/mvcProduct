package com.s01.basic;
class Tv{
	//�������(�Ӽ�)
	boolean power; //��������(on/off)
	int channel; //ä��
	
	//����޼���(����)
	public void isPower() {//TV�� Ŀ�ų� ���� ���
		power = !power;
	}
	
	public void channelUp() {//TV ä���� ���̴� ���
		++channel;
	}
	
	public void channelDown() {//TV ä���� ���ߴ� ���
		--channel;
	}
	
}

public class TvMain {
	public static void main(String[] args) {
		Tv t = new Tv();
		//TV�ѱ�
		t.isPower();//false -> true
		System.out.println("TV ���� ���� : " + t.power);
		System.out.println("���� ä�� : " + t.channel);
		
		System.out.println("------------------");
		
		//ä�� ����
		t.channel = 7;
		System.out.println("ù��° ����� ä�� : " + t.channel);
		
		System.out.println("------------------");
		
		//ä�� ����
		t.channelUp();
		System.out.println("�ι�° ����� ä�� : " + t.channel);
		
		System.out.println("------------------");
		
		//TV����
		t.isPower();//true -> false
		System.out.println("Tv ���� ���� : " + t.power);
	}
}





