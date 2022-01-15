package com.s06.product;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProductMain {
	ArrayList<Product> list;
	BufferedReader br;
	
	//생성자
	public ProductMain() {
		list = new ArrayList<Product>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br != null)try {br.close();} catch(IOException e) {}
		}
	}
	
	//메뉴
	public void callMenu() throws IOException {
		while(true) {
			try {
				System.out.print("1. 상품입력 2. 상품목록보기 3. 종료 > ");
						// String -> int
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					input(); //상품 입력
				}else if(num == 2) {
					output(); //상품 목록 보기
				}else if(num == 3) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못입력했습니다..");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 허용!");
			}
		}
	}
	
	//상품 정보 입력
	public void input() throws IOException{
		Product p = new Product();
		System.out.print("상품명 : ");
		p.setName(br.readLine());
		System.out.print("상품번호 : ");
		p.setNum(br.readLine());
		System.out.print("가격 : ");
		p.setPrice(Integer.parseInt(br.readLine()));
		System.out.print("메이커 : ");
		p.setMaker(br.readLine());
		System.out.print("재고 : ");
		p.setStock(Integer.parseInt(br.readLine()));
	
		//Product를 ArrayList에 저장
		list.add(p);
	}
	
	
	//상품 정보 호출
	public void output() {
		System.out.println("상품 리스트 : 총 상품 수(" + list.size() + ")");
		System.out.println("상품명\t상품번호\t가격\t메이커\t재고수");
		//확장 for문
		for(Product pt : list) {
			System.out.printf("%s\t", pt.getName());
			System.out.printf("%s\t", pt.getNum());
			System.out.printf("%,d원\t", pt.getPrice());
			System.out.printf("%s\t", pt.getMaker());
			System.out.printf("%,d\n", pt.getStock());
			
		}
	}

	public static void main(String[] args) {
		new ProductMain();
	}
}
