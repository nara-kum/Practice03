package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int plus = 0;
		int minus = 0;
		int sum;
		
		while(true) {

			sum = plus+(-minus);
			
			System.out.println("-------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-------------------------------");
	
			System.out.print("선택 > ");
			int select = sc.nextInt();
			
			if(select==4) {
				break;
			}else if(select==1) {
				System.out.print("예금액 > ");
				plus = sc.nextInt();
			}else if(select==2) {
				System.out.print("출금액 > ");
				minus = sc.nextInt();
			}else if(select==3) {
				System.out.print("잔고액 > ");
				System.out.println(sum);
			}else {
				System.out.println("다시 입력해주세요");
			}
		
		}
		
		System.out.print("프로그램 종료");
		
		sc.close();

	}

}
