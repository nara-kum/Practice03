package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] wonArray = new int[10];
		
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		//금액 입력
		System.out.println("금액: "); int won = sc.nextInt();
		
		while(true) {
			
			if(won==0) {
				break;
			}
		}
		
		sc.close();
		
	}

}
