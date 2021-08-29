package com.bridgelabz.testmaximum;

import java.util.Scanner;

public class TestMaximumOfThree {
	
	private static Integer findMax(Integer number1, Integer number2, Integer number3) {
		Integer max = number1;
		
		if(number2.compareTo(max)>0) {
			max = number2;
		}
		if(number3.compareTo(max)>0) {
			max = number3;
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		Integer max = findMax(number1 , number2, number3);
			
		System.out.println("the maximum number is : "+max);
	}
}
