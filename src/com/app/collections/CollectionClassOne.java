package com.app.collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionClassOne {
	public static void main(String[] args) {
		TestMain c=new TestMain();
		c.myAddition();
		System.out.println(c.check());
	}
}


class TestMain
{
	private String name;
	private Integer age;
	private String dept;
	private Map<String, Integer> myMap=new HashMap<>();
	String s1="shruti";
	String s2=s1;
	
	public void myAddition()
	{
		
		myMap.put(s1, 10);
		myMap.put(s2, 20);
	}
			
	public boolean check()
	{
		return myMap.containsKey(s1);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((myMap == null) ? 0 : myMap.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	
	
}
