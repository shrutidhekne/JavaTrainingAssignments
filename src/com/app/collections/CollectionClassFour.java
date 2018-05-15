package com.app.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassFour {

	public static void main(String[] args) {
		
		List<String> listOne=new ArrayList<>();
		listOne.add("One");
		listOne.add("Two");
		listOne.add("Three");
		listOne.add("Four");

		List<String> listTwo=Collections.unmodifiableList(listOne);
		
		
		System.out.println("List 1");
		System.out.println(listOne);

		System.out.println("List 2");
		System.out.println(listTwo);
		

	}

}
