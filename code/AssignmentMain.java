package edu.nyu.objects;

import java.util.Scanner;

public class AssignmentMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Assignment assignment=new Assignment();
		System.out.println("Enter your name");
		String name=scanner.nextLine();
		assignment.setName(name);
		System.out.println("Enter your first subject marks");
		int maths=scanner.nextInt();
		assignment.setSubject1(maths);
		System.out.println("Enter second subject marks");
		int science=scanner.nextInt();
		assignment.setSubject2(science);
		System.out.println("Enter third subject marks");
		int social=scanner.nextInt();
				assignment.setSubject3(social);
				System.out.println("your total is"+assignment.getTotal());
				System.out.println("your grade is"+assignment.getGrade());
				}
}