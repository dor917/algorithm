package com.kdh.step1to10;

import java.util.Scanner;

public class no2753 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		
		if ( A % 100 != 0 && A % 4 == 0) {
			System.out.println("1");
		} else if (A % 400 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}
