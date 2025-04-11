package com.bl.oops;

import java.util.Scanner;

public class LineComparision {
	//main method 
	public static void main(String[] args) {
		//printing welcome message 
		System.out.println("Hii Welcome to LineComparision program");
		Scanner sc = new Scanner(System.in);
		
		//taking user input to find the length
		System.out.println("Enter x1 coordinate : ");
		int x1 = sc.nextInt();
		System.out.println("Enter x2 coordinate: ");
		int x2 = sc.nextInt();
		System.out.println("Enter y1 coordinate : ");
		int y1 = sc.nextInt();
		System.out.println("Enter y2 coordinate : ");
		int y2 = sc.nextInt();
		double lengthOfaLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("The length of a line : " + lengthOfaLine);
		sc.close();
	}
}
