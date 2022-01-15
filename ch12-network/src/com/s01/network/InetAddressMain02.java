package com.s01.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressMain02 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("������Ʈ �ּ� �Է� : ");
			String url = br.readLine();
			//�ش� �����ΰ� ���εǾ� �ִ� ��� IP�ּҸ� Ȯ��
			InetAddress[] addresses = InetAddress.getAllByName(url);
			for(int i = 0; i < addresses.length; i++) {
				System.out.print("ȣ��Ʈ �̸� : " + addresses[i].getHostName());
				System.out.println(", IP�ּ� : " + addresses[i].getHostAddress());
			}
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(br != null) try {br.close();} catch(IOException e) {}
		}
		
		
	}
}
