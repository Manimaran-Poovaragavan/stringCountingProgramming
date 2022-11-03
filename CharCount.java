package com.java.project;
import java.util.Scanner;
public class CharCount {
	public static void main(String[] args) {
		String letter ;
		int i,length,counter[] = new int[256];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
	    letter= sc.nextLine();
		
	//	length =letter .length();
		
		for(int i1=0;i1<letter.length();i1++) {
			counter[(int)letter.charAt(i1)]++;
		}
		for(int i1=0;i1<256;i1++) {
			if(counter[i1] !=0) {
				System.out.println((char)i1+"="+counter[i1]);
				
			}
			
		}
			
		}
		
		
	}


