package edu.nyu.exception;

public class VarArgSample {
	public static void m1(int... x){
		System.out.println("In method one");
	
		
	}
	public static void main(String[] args) {
		m1();
		m1(2,3);
		m1(4,5,6);
		m1(5,6,7,8);
	}

}
