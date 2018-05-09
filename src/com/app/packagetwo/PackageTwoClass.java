package com.app.packagetwo;

import com.app.packageone.ParentClassOne;

public class PackageTwoClass {
	public static void main(String args[])
	{
		ParentClassOne p1=new ParentClassOne();
		//p1.display();
		
		/*p1.display();
		 * Calling public method of ParentClassOne() from a class in another 
		 * package. 
		 * This displays (ParentClassOneDisplay)Value of x is: 10
		 * */
		
		/* p1.display();
		*Calling private method from a class in another 
		* package. 
		*Error encountered: The method display() from the type 
		*		ParentClassOne is not visible
		*/
		
		/* p1.display();
		*Calling protected method from a class in another 
		* package. 
		*Error encountered: Error encountered: The method display() is undefined
		* for the type PackageTwoClass
		*/
		
		/* p1.display();
		*Calling default method from a class in another 
		* package. 
		*Error encountered: The method display() from the type 
		*		ParentClassOne is not visible
		*/
	}

}
