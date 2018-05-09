package com.app.packageone;

public class ParentClassOne {
	private int x=10;
	/**
	 * 
	 */
	public ParentClassOne()
	{
		System.out.println("From constr of ParentClassOne");
	}
	protected void display()
	{
		System.out.println("(ParentClassOneDisplay)Value of x is: "+x);
	}
}
