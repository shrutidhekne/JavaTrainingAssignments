package com.app.packageone;
import com.app.packageone.ParentClassOne;
public class PackageOneClass {

	public static void main(String[] args) {
		ParentClassOne p1=new ParentClassOne();
		p1.display();
		/* p1.display();
		*Calling public method from another class in the same package. 
		*This displays (ParentClassOneDisplay)Value of x is: 10
		*/
		
		/* p1.display();
		*Calling private method from another class in the same package. 
		*Error encountered: The method display() from the type 
		*		ParentClassOne is not visible
		*/
		
		/* p1.display();
		*Calling protected method from another class in the same package. 
		*Error encountered: The method display() is undefined
		* for the type PackageOneClass
		*/
		
		/* p1.display();
		*Calling default method from another class in the same package. 
		*This displays (ParentClassOneDisplay)Value of x is: 10
		*/
	}

}
