package com.kdh.step1to10;

import java.util.Scanner;

public class no2439 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = N; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
				
			}
			for (int j = N-i+1; j > 0; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
