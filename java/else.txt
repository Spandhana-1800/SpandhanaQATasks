package edu.nyu.exception;

public class TryCatch {
	public static void main(String[] args) {
		int number1=10;
		int number2=0;
		try{
			System.out.println(number1/number2);
}
		catch(Exception e){
			System.out.println("divide by zero");
			
		}
	}

}
