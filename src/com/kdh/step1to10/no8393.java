package com.kdh.step1to10;

import java.util.Scanner;

public class no8393 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int result = 0;
		for (int i = 1; i < n+1; i++) {
			result = result + i;
		}
		System.out.println(result);
	}

}
