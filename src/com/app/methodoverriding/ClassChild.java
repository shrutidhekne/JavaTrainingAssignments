package com.app.methodoverriding;

public class ClassChild extends ClassParent {
	@Override
	protected void sayHello() throws NullPointerException
	{
		System.out.println("Hello from child class");
	}
	
}

/*
	trying out the access types :
	1)when the overridden method in the parent class is marked default, the overriding method 
		should be less restricted, i.e the subclass method should be either protected or public. 
		If the overriding method is made private we get an error: 
			Cannot reduce the visibility of the inherited method from ClassParent


	2)when the overridden method in the parent class is marked protected, the overriding method
		should be less restricted, i.e the subclass method should be only public.
		If the overriding method is made private or default we get an error:
			Cannot reduce the visibility of the inherited method from ClassParent
			
	trying out the exception handling cases:
	1)The overriding method must NOT throw checked exceptions that are new or broader
	 than those declared by  the overridden method. 
	 eg: If the base class overridden method throws a NullPointerException and the child class
	 overriding method throws an Exception then we get the error: 
	 	 Exception Exception is not compatible with throws clause in ClassParent.sayHello()

	We cannot override static and final methods.

*/