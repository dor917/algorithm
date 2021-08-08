package com.kdh.step1to10;

import java.util.Scanner;

public class no2562 {

	public static void main(String[] args) {
		int chek = 1;
		
		int[] arr = new int[9];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			arr[i] = scanner.nextInt();
		}
		int temp = arr[0];
		for (int i = 0; i < 8; i++) {
			if (temp < arr[i+1]) {
				chek = i+2;
				temp = arr[i+1];
			}
		}
		
		System.out.println(temp);
		System.out.println(chek);
	}
}
