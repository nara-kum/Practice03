package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int i=1;
		int cnt = 0;
		int sum = 0;
		
		
		while(i<=num) {
			
			if(i%5==0) {
				cnt = cnt+1;
				sum = sum+i;
			}else if(i==num) {
				
				break;
			}
			
			i++;
			
		}
		
		System.out.println("5의 배수의 개수 : " + cnt);
		System.out.println("5의 배수의 합 : " + sum);
		
		sc.close();

	}

}
