package edu.nyu.exception;

public class VarArg2 {
	public static void main(String[] args) {
		sum ();
		sum (10);
		sum (10,20,30,40);
	}
	public static void sum(int...number) {
		int sum=0;
		for(int i : number){
			sum = sum + i;
		
		
		}
		System.out.println(sum);
		
	}

}
