package com.app.sort;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		int[] arr; 
		int ch=0;
		Sort b;
		do
		{
			System.out.println("1.Bubble Sort 2.Merge Sort 3.Quick Sort 4.Insertion Sort");
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			System.out.println("Enter the number of elements: ");
			n=sc.nextInt();
			arr=new int[n];
			System.out.println("Enter the elements: ");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Before sorting");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(" "+arr[i]);
			}
			System.out.println();
			switch(ch)
			{
				case 1:
					b=new BubbleSort();
					b.sort(arr);
					break;
				case 2:
					b=new MergeSort();
					b.sort(arr);
					break;
				case 3:
					b=new QuickSort();
					b.sort(arr);
					break;
				case 4:
					b=new InsertionSort();
					b.sort(arr);
					break;
				default:
					System.out.println("Enter a valid option.");				
			}
		}while(ch!=5);		
		sc.close();
	}	
}