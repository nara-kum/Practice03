package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum=0;
		int sum2=0;
		
		sc.close();
		
		while(true) {
			
			if(num%2!=0) {
				for(int i=1; i<=num; i=i+2) {
					sum = sum+i;
				}
				
				System.out.print("결과값 : " + sum);
				break;
			}
			
			for(int j=0; j<=num; j=j+2) {
				sum2 = sum2+j;
			}
			
			System.out.println(sum2);
			break;
			
		}

		
	}

}
