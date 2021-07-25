package com.kdh.step1to10;

import java.util.Scanner;

public class no2739 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(A +  " * " + i  + " = "+ A* i);
		}

	}

}
