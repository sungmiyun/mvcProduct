package com.s01.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		String url = null;
		InetAddress iaddr = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("������Ʈ �ּ� �Է� : ");
			url = br.readLine();
			
			iaddr = InetAddress.getByName(url);
			
			System.out.println("ȣ��Ʈ �̸� : " + iaddr.getHostName());
			System.out.println("ȣ��Ʈ IP�ּ� : " + iaddr.getHostAddress());
			
			System.out.println("=======================================");
			
			//���� ȣ��Ʈ IP�ּ� ���ϱ�
			iaddr = InetAddress.getLocalHost();
			
			System.out.println("���� ȣ��Ʈ �̸� : " + iaddr.getHostName());
			System.out.println("���� ȣ��Ʈ IP�ּ� : " + iaddr.getHostAddress());
			
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
		}
		
		
	}
}
