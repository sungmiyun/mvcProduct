package com.s07.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomerMain01 {
	public static void main(String[] args) {
		System.out.println("====��ü ����ȭ �ϱ�====");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//����ȭ�� ��ü ����
		Customer c = new Customer("ȫ�浿");
		
		try {
			fos = new FileOutputStream("object.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(c); //��ü ����ȭ ����
			
			System.out.println("��ü ����ȭ�� �Ϸ�Ǿ����ϴ�.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(oos != null) try {oos.close();} catch(IOException e) {}
			if(fos != null) try {fos.close();} catch(IOException e) {}
		}
		
		
		
	}
}
