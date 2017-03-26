package edu.nyu.Inheritance;

class Vehicle{
	public void greeting(){
		System.out.println("This is a vehicle");
	}
	
}
class Bike extends Vehicle{
	public void greeting(){
		System.out.println("This is a bike");
	}
}
class Car extends Vehicle{
	public void greeting(){
		System.out.println("This is a Car");
	}
}
public class Overriding{
	public static void main(String[] args) {
		Vehicle vehicle=new Bike();
		Vehicle v1=new Car();
		vehicle.greeting();
		v1.greeting();
	}
}

 



