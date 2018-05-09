package com.app.packagetwo;

import com.app.packageone.ParentClassOne;

public class ChildClassTwo extends ParentClassOne {
	public ChildClassTwo()
	{
		System.out.println("Constructor of ChildClassTwo");
	}

	
	
	/*private void method() {
		display();
	}
*/
	


	/*public static void main(String args[]) {
		ChildClassTwo c=new ChildClassTwo();
	
		
		
		 * p1.display(); Calling public method of ParentClassOne from a subclass
		 * in another package. This displays (ParentClassOneDisplay)Value of x
		 * is: 10
		 

		
		 * p1.display(); Calling private method of ParentClassOne from a
		 * subclass in another package. Error encountered: The method display()
		 * from the type ParentClassOne is not visible
		 

		
		 * p1.display(); Calling protected method of ParentClassOne from a
		 * subclass in another package. This displays (ParentClassOneDisplay)Value of x
		 * is: 10
		 

		
		 * p1.display(); Calling default method of ParentClassOne from a
		 * subclass in another package. Error encountered: The method display() 
		 * from the type ParentClassOne is not visible
		 
	}*/
}
