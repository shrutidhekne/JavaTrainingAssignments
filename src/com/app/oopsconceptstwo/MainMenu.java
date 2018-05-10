package com.app.oopsconceptstwo;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			System.out.println();
			System.out.println("--Cake Menu--");
			System.out.println("1.Birthday Party \n2.Wedding Anniversary \n3.Office Party \n4.Exit");
			System.out.println("Select an option: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					BirthdayCake b=new BirthdayCake();					
					b.birthdayCakeProcess();
					break;
					
				case 2:
					WeddingCake w=new WeddingCake();
					w.weddingCakeProcess();
					break;
					
				case 3:
					OfficeParty o=new OfficeParty();
					o.officePartyProcess();
					break;					
				default:
					System.out.println("Enter valid option.");
			}
		}while(choice!=4);
		sc.close();
		

	}

}
