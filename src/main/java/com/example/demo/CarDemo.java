package com.example.demo;

public class CarDemo {

	
	void carYes(){
		System.out.println("Car Yes");
	}
	
	
	
	void carRepair(){
		System.out.println("Car Repair ");
	}
	
	
	public static void main(String[] args) {
		
		CarDemo d=new CarDemo();
		d.carRepair();
	}
	
	void carNormal() {
		System.out.println("car Normal()");
	}
}
