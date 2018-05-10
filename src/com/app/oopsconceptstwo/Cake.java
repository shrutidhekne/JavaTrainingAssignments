package com.app.oopsconceptstwo;

import java.util.Scanner;

public class Cake implements Party {
	Scanner sc=new Scanner(System.in);
	@Override
	public void startBaking() {
		System.out.println("Mission: Baking a cake");
	}

	@Override
	public String addFlavour() {
		System.out.println("Which flavour do you prefer?");
		System.out.println("1.Butterscotch \n2.Chocolate \n3.Strawberry");
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("You have selected butterscotch flavour");
			return "butterscotch";
		}
		else if(choice==2)
		{
			System.out.println("You have selected chocolate flavour");
			return "chocolate";
		}
		else if(choice==3)
		{
			System.out.println("You have selected strawberry flavour");
			return "strawberry";
		}
		else
		{
			System.out.println("You have not selected any flavour");
			return "";
		}
		
	}

	@Override
	public void bakeCake(String flavour) {
		System.out.println("Baking the "+flavour+" cake..");
	}

	@Override
	public void addFrosting() {
		System.out.println("Adding frosting..");
	}

	@Override
	public void stopBaking() {
		System.out.println("Mission accomplished!");
		System.out.println("Your cake is ready!");
	}

}
