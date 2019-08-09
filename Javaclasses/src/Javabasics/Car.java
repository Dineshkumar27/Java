package Javabasics;

public class Car {
	int wheels;
	String comapanyName;
	String color;
	
	void displayDetails() {  //method definition
		System.out.println("no of wheels: "+wheels);
		System.out.println("Company: "+comapanyName);
		System.out.println("Color:  "+color);
	}
	void move() {//method definition
		System.out.println("running ....");
	}
     void stop() {
    	 System.out.println("Stopped");
     }
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Started...");
		
	}
}
