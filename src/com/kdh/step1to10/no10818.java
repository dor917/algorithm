package com.kdh.step1to10;

import java.util.Scanner;

public class no10818 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		int max = arr[0], min = arr[0];
		for (int i : arr) {
			if (max < i ) {
				max = i;
			}
			if (min > i) {
				min = i;
			}
		}
		System.out.println(min + " " + max);
		
	}
}
