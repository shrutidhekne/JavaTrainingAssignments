package com.app.oopsconceptstwo;

public class BirthdayCake extends Cake{
	public BirthdayCake()
	{
		System.out.println("We are having a birthday party!!");
	}
	
	public void addCandles(int numofcandles)
	{
		
		System.out.println("Adding "+numofcandles+" candles on the cake..");
	}
	
	public void birthdayCakeProcess()
	{
		String flavour=addFlavour();
		System.out.println("Enter the number of candles you need: ");
		int numofcandles=sc.nextInt();		
		startBaking();
		bakeCake(flavour);
		addFrosting();
		addCandles(numofcandles);
		stopBaking();		
	}
}
