package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int no = 27;
		
		System.out.println("========================");
		System.out.println("   [숫자 맞추기 게임 시작]   ");
		System.out.println("========================");

		
		while(true) {
			
			System.out.print (">>");
			int num = sc.nextInt();
			
			if(num==27) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >> ");
				String yn = sc.next();
				
				if(yn.equals("y")) {
					System.out.println("========================");
					System.out.println("   [숫자 맞추기 게임 종료]   ");
					System.out.println("========================");
					break;
				}else if(yn.equals("n")){
					continue;
					
				}
				
			}else if(num>27) {
				System.out.println("더 낮게");
			}else if(num<27) {
				System.out.println("더 높게");
			}
		}
		
		
		sc.close();
		

	}

}
