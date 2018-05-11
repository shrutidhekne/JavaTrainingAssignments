package com.app.sort;

public class BubbleSort implements Sort {

	@Override
	public void sort(int[] arr) {
		
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1] > arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		display(arr);
	}
	@Override
	public void display(int[] arr) {
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();		
	}
}