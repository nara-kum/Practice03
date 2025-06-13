package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//숫자(정수) 입력받기
		System.out.println("5개의 숫자를 입력해주세요");
		
		//5개짜리 배열 선언
		double[] num = new double[5];
		
		double sum = 0;
		
		//배열에 입력한 변수 담고 합하기
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			sum = sum + num[i]; 
		}
		
		System.out.println("평균은 "+ sum/num.length + " 입니다.");
		
		sc.close();
	}

}
