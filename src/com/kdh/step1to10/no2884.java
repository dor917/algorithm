package com.kdh.step1to10;

import java.util.Scanner;

public class no2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
	
		if(B-45 < 0){
			int min = 15 + B;
			if (A == 0 ) {
				System.out.println(23 +" " + min );
			} else {
				System.out.println(A-1 +" " + min );
			}

		} else {
			System.out.println(A +" " + (B-45));
		}
	}
	

}
