package com.app.sort;
public class QuickSort implements Sort {

	@Override
	public void sort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
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
	public static void quickSort(int[] arr,int low,int high)
	{
		int i=low;
		int j=high;
		int pivot=arr[(low+high)/2];
		int temp;
		while(i<=j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}
			while(pivot<arr[j])
			{
				j--;
			}
			
			if(i<=j)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				i++;
				j--;
			}
		}
		
		if(low<j)
			quickSort(arr, low, j);
		if(i<high)
			quickSort(arr, i, high);
		
	}
	
}
