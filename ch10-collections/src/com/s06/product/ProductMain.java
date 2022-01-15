package com.s06.product;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProductMain {
	ArrayList<Product> list;
	BufferedReader br;
	
	//������
	public ProductMain() {
		list = new ArrayList<Product>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(br != null)try {br.close();} catch(IOException e) {}
		}
	}
	
	//�޴�
	public void callMenu() throws IOException {
		while(true) {
			try {
				System.out.print("1. ��ǰ�Է� 2. ��ǰ��Ϻ��� 3. ���� > ");
						// String -> int
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					input(); //��ǰ �Է�
				}else if(num == 2) {
					output(); //��ǰ ��� ����
				}else if(num == 3) {
					System.out.println("���α׷� ����");
					break;
				}else {
					System.out.println("�߸��Է��߽��ϴ�..");
				}
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� ���!");
			}
		}
	}
	
	//��ǰ ���� �Է�
	public void input() throws IOException{
		Product p = new Product();
		System.out.print("��ǰ�� : ");
		p.setName(br.readLine());
		System.out.print("��ǰ��ȣ : ");
		p.setNum(br.readLine());
		System.out.print("���� : ");
		p.setPrice(Integer.parseInt(br.readLine()));
		System.out.print("����Ŀ : ");
		p.setMaker(br.readLine());
		System.out.print("��� : ");
		p.setStock(Integer.parseInt(br.readLine()));
	
		//Product�� ArrayList�� ����
		list.add(p);
	}
	
	
	//��ǰ ���� ȣ��
	public void output() {
		System.out.println("��ǰ ����Ʈ : �� ��ǰ ��(" + list.size() + ")");
		System.out.println("��ǰ��\t��ǰ��ȣ\t����\t����Ŀ\t����");
		//Ȯ�� for��
		for(Product pt : list) {
			System.out.printf("%s\t", pt.getName());
			System.out.printf("%s\t", pt.getNum());
			System.out.printf("%,d��\t", pt.getPrice());
			System.out.printf("%s\t", pt.getMaker());
			System.out.printf("%,d\n", pt.getStock());
			
		}
	}

	public static void main(String[] args) {
		new ProductMain();
	}
}
