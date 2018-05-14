package com.app.constructors;

public class MainClass {

	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		
	}

}

/*Constructor name is the same as that of the class.
 * 
 * If we do not provide a constructor, them the compiler provides a default 
 * constructor.
 * 
 * If we provide our own default constructor, then the compiler does not provide
 * any default constructor. 
 * 
 * If we have do not have a no-arg constructor in the child class, and we 
 * type our own parameterized constructor, then the compiler by 
 * default makes a call to the parent class constructor. 
 * 
 * If there is a parameterized constructor in the super class, then the
 * subclass should also have a parameterized constructor.
 * 
 * We cannot call the constructor from a method. 
 * 
 * 
 * 
 * */ 