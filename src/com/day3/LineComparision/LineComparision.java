package com.day3.linecomparision;

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
		double lineLength1 = Math.sqrt((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		System.out.println("Length of a line : " + lineLength1);
		String str1 = Double.toString(lineLength1);

		System.out.println("Enter the co ordinates of x3 and y3 : ");
		int x3 = scanner.nextInt();
		int y3 = scanner.nextInt();

		System.out.println("Enter the co ordinates of x4 and y4 : ");
		int x4 = scanner.nextInt();
		int y4 = scanner.nextInt();

		System.out.println("A Length as 2 points : " + "(" + x3 + "," + y3 + ")" + "and" + "(" + x4 + "," + y4 + ")");
		double lineLength2 = Math.sqrt((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3));
		System.out.println("Length of a line : " + lineLength2);
		String str2 = Double.toString(lineLength2);

		if (str1.equals(str2)) {
			System.out.println("Both lines are EQUAL ");
		} else
			System.out.println("Both lines are Not EQUAL ");

		scanner.close();

	}

}
