package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int sum=0;
		int i=1;
		
		while(true) {

			System.out.print(i);
			sum=sum+i;
			
			if(i==num) {
				System.out.println();
				break;
			}
			
			System.out.print("+");
			
			i++;
		}

		System.out.println("합계 : "+sum);
		
		sc.close();

	}

}
