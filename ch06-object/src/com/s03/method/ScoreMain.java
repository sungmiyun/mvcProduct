package com.s03.method;

class Score{
	/*
	 * [�ǽ�]
	 * Score
	 * ������� : �̸�(name), ����(korean), ����(english), ����(math)
	 * ����޼��� : ����(int getSum()), ���(double getAverage()), ���(String getGrade())
	 *            �������(void printScore()) 
	 *            -> �̸�, ����, ����, ����, ����, ���, ���
	 *            
	 * ScoreMain
	 * Scanner ��ü ����
	 * Score ��ü ����
	 * �̸�, ����, ����, ���� 
	 * ���� ���
	 */
	
	String name;
	int korean;
	int english;
	int math;
	
	public int getSum() {
		return korean + english + math;
	}
	
	public double getAverage() {
		return getSum() / 3.0;
	}
	
	public String getGrade() {
		String grade;
		
		switch((int)(getAverage()/10)) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default : grade = "F";
		}
		return grade;
		
		
	}
	
	
	public void printScore() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + korean);
		System.out.println("���� : " + english);
		System.out.println("���� : " + math);
		System.out.println("���� : " + getSum());
		System.out.println("��� : " + getAverage());
		System.out.println("��� : " + getGrade());
	}
	
	
	
	
}

public class ScoreMain {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		Score sc = new Score();
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		sc.name = input.next();
		System.out.print("���� ������ �Է��ϼ��� : ");
		sc.korean = input.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		sc.english = input.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		sc.math = input.nextInt();
		
		sc.printScore();
		
		input.close();
		
	}

}
