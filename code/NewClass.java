package edu.nyu.objects;

import java.util.Scanner;

public class NewClass {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		TestObject testObject=new TestObject();
		System.out.println("Enter your name here");
	
		int sum=testObject.add(5,6);
		System.out.println(" The sum is "+sum);
		int difference=testObject.sub(11, 4);
		System.out.println(" The difference is " + difference);
		}
}
