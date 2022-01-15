package com.s02.network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class URLMain {
	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://java.sun.com/index.jsp?name=kim#content");
			System.out.println("�������� : " + url.getProtocol());
			System.out.println("ȣ��Ʈ : " + url.getHost());
			System.out.println("��Ʈ : " + url.getPort());
			System.out.println("�⺻���� : " + url.getDefaultPort());
			System.out.println("�н� : " + url.getPath());
			System.out.println("���� : " + url.getQuery());
			System.out.println("ref : " + url.getRef());
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}
}
