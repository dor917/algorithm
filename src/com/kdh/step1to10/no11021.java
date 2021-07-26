package com.kdh.step1to10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class no11021 {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		try {
			int N = Integer.parseInt(br.readLine());
	        
			StringTokenizer st;
	 
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine()," ");
				bw.write("Case #"+(i+1)+": "+(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
			}
			br.close();
	        
			bw.flush();
			bw.close();
	 
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	

	
}
