package com.practice;

public class Child extends Parent {
	
	public Child(){
		super(123);
		System.out.println("child default constructot");
		
	}
public Child(int id){
	
	System.out.println("child id is : "+id);
		
	}
public Child(String name){
	System.out.println("Child name is : "+name);
	
}
	
	public static void main(String[] args) {
		
		Child c=new Child();
	}
}
