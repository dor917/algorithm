package com.kdh.step1to10;

import java.util.Scanner;

public class no10871 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int X = scanner.nextInt();
		int [] arr = new int[A];
		
		for (int i = 0; i < A; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i : arr) {
			if (i<X) {
				System.out.print(i+" ");
			}
		}
	}
}
