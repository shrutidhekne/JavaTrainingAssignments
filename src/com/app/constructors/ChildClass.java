package com.app.constructors;

public class ChildClass extends ParentClass {
	public ChildClass()
	{
		
		System.out.println("Hello from constr of ChildClass");
	}
	/*public ChildClass(int a,int b)
	{
		System.out.println("Hello from parameterized constr of ChildClass");
	}*/
	public void sayHello()
	{
		/*
		 * We cannot call a constructor from a method.
		 */
	}
}