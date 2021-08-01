package com.kdh.step1to10;

import java.util.Scanner;

public class no1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int k = N;
		int d = N/10 + N%10;
		int count = 1;
	
		while (true){
			
			if (((k%10)*10)+d%10 == N) {
				System.out.println(count);
				break;
			} else {
				count ++;
				k = (k%10)*10 + d%10 ;
				d = k%10 + k/10;
			}
			
		
		}
		
		
		
	}
}
