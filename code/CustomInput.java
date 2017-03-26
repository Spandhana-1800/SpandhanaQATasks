package edu.nyu.additionSample;

import java.util.Scanner;

public class CustomInput {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int number1,number2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number");
		number1=scanner.nextInt();
		System.out.println("Enter the second number");
		number2=scanner.nextInt();
		System.out.println(number1+number2);
	}
	}