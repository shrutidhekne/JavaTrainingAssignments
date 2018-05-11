package com.app.sort;

public class MergeSort implements Sort {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		mergeSort(arr, 0, arr.length-1);		
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
	public static void mergeSort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        
        mergeSort(a, low, mid); 
        mergeSort(a, mid, high); 

        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }

}
