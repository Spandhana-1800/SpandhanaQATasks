package edu.nyu.objects;

public class Main {
	public static void main(String[] args) {
		Instance instance = new Instance();
		instance.setNumber1(55);
		instance.setNumber2(45);
		System.out.println(
				" The sum of " + instance.getNumber1() + " and " + instance.getNumber2() + " is " + instance.add());
	}

}
