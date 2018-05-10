package com.app.oopsconceptstwo;

public class OfficeParty extends Cake{
	public OfficeParty()
	{
		System.out.println("We are having an office party!!");
	}
	
	public void addCookies()
	{
		System.out.println("Do you want cookies as well? 1.Yes 2.No ");
		System.out.println("Choose an option: ");
		int ch=sc.nextInt();
		int numofcookies;
		if(ch==1)
		{
			System.out.println("How many cookies do you need? ");
			numofcookies=sc.nextInt();
			System.out.println("Adding "+numofcookies+" to your cart..");
		}
		else 
		{
			System.out.println("You should try the cookies some other time!");
		}		
	}
	
	public void officePartyProcess()
	{
		String flavour=addFlavour();	
		startBaking();
		bakeCake(flavour);
		addFrosting();
		stopBaking();	
		addCookies();
	}
}
