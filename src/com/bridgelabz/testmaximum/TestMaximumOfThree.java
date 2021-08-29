package com.bridgelabz.testmaximum;

import java.util.Scanner;

public class TestMaximumOfThree {
	
	private static Float findMax(Float number1, Float number2, Float number3) {
		Float max = number1;
		
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
		System.out.println("Enter Three floating point numbers");
		float number1 = sc.nextFloat();
		float number2 = sc.nextFloat();
		float number3 = sc.nextFloat();
		
		Float max = findMax(number1 , number2, number3);
			
		System.out.println("the maximum number is : "+max);
	}
}
