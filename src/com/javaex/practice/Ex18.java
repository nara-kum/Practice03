package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int total = num+(num-1);
		String star = "*";
		
		
		for(int y=1; y<=num; y++) {
			for(int x=num; x>=y; x--) {
				System.out.print(star);
			}
			System.out.println();
		}
		for(int y=2; y<=num; y++) {
			for(int x=1; x<=y; x++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		sc.close();

	}

}