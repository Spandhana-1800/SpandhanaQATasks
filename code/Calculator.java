package edu.nyu.dataTypes;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int number1, number2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 addition");
		System.out.println("2 subtraction");
		System.out.println("3 multiplication");
		System.out.println("4 division");
		System.out.println("Enter your choice");
		String option = scanner.next();

		switch (option) {//////6666/
		case "add":
			System.out.println("Enter number1");
			number1 = scanner.nextInt();
			System.out.println("Enter number2");
			number2 = scanner.nextInt();
			System.out.println("sum is" + (number1 + number2));
			break;
		case "sub":
			System.out.println("Enter num1");
			number1 = scanner.nextInt();
			System.out.println("Enter number2");
			number2 = scanner.nextInt();
			System.out.println("difference is" + (number1 - number2));
			break;
		case "mul":
			System.out.println("Enter number1");
			number1 = scanner.nextInt();
			System.out.println("Enter number2");
			number2 = scanner.nextInt();
			System.out.println("Product is" + (number1 * number2));
			break;
		case "div":
			System.out.println("Enter number1");
			number1 = scanner.nextInt();
			System.out.println("Enter number2");
			number2 = scanner.nextInt();
			System.out.println("quotient is" + (number1 / number2));
			break;
		default:
			System.out.println("not a valid option");
			break;

		}
		scanner.close();
	}
}
