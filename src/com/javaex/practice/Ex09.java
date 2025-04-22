package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		for(int y=0; y<=10; y++) {
			for(int x=y+1; x<y+10; x++) {
				System.out.print(x+"\t");
			}
			System.out.println();
		}
	}

}
