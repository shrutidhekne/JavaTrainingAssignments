package com.app.sort;

public class InsertionSort implements Sort {

	@Override
	public void sort(int[] arr) {
		int key;
		int i;
		for(int j=1;j<arr.length;j++)
		{
			key=arr[j];
			i=j-1;
			while((i>-1) && (arr[i]>key))
			{
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;			
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