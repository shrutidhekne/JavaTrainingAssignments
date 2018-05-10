package com.app.oopsconceptstwo;

public class WeddingCake extends Cake {
	public WeddingCake()
	{
		System.out.println("We are having an anniversary party!");
	}
	
	public void addLayers(int numoflayers)
	{
		for(int i=1;i<=numoflayers;i++)
		{
			System.out.println("Adding layer "+i+" on the cake..");
		}
	}
	
	public void weddingCakeProcess()
	{
		System.out.println("Enter the number of layers you need on the cake: ");
		int numoflayers=sc.nextInt();
		String flavour=addFlavour();
		startBaking();
		bakeCake(flavour);
		addLayers(numoflayers);
		addFrosting();
		stopBaking();
		
	}
}
