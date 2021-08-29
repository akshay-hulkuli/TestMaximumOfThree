package com.bridgelabz.testmaximum;

import java.util.Scanner;

public class TestMaximumOfThree {
	
	private static <E extends Comparable<E>> E findMax(E data1, E data2, E data3) {
		E max = data1;
		
		if(data2.compareTo(max)>0) {
			max = data2;
		}
		if(data3.compareTo(max)>0) {
			max = data3;
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean exit = true;
		while(true) {
			System.out.println("Select options 1: compare integers 2: compare floating point numbers 3:copmare strings 4:exit");
			switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter 3 integers");
					int maxInt = findMax(sc.nextInt(),sc.nextInt(),sc.nextInt());
					System.out.println("the maximum integer is :"+maxInt);
					break;
				case 2:
					System.out.println("Enter 3 Floating point numbers");
					Float maxFloat = findMax(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
					System.out.println("the maximum Floating point numbers is :"+maxFloat);
					break;
				case 3:
					System.out.println("Enter 3 strings");
					String maxString = findMax(sc.next(),sc.next(),sc.next());
					System.out.println("the largest string based on compareTo is :"+maxString);
					break;
				default:
					exit = false;
					System.out.println("Exiting");
				
			}
		}
	
		
	}
}
