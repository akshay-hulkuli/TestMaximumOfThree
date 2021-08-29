package com.bridgelabz.testmaximum;

import java.util.Scanner;

public class TestMaximumOfThree {
	
	private static String findMax(String str1, String str2, String str3) {
		String max = str1;
		
		if(str2.compareTo(max)>0) {
			max = str2;
		}
		if(str3.compareTo(max)>0) {
			max = str3;
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three strings");
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		
		String max = findMax(str1 , str2, str3);
		
		System.out.println("the maximum string is : "+max);
	}
}
