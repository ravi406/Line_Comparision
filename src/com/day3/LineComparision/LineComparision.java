package com.day3.LineComparision;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparision Computation :");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the co ordinates of x1 and y1 : ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();

		System.out.println("Enter the co ordinates of x2 and y2 : ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		System.out.println("A Length as 2 points : " + "(" + x1 + "," + y1 + ")" + "and" + "(" + x2 + "," + y2 + ")");
		double lineLength = Math.sqrt((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		System.out.println("Length of a line : " + lineLength);

		scanner.close();

	}

}
