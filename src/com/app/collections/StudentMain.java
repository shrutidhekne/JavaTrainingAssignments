package com.app.collections;

import java.util.HashSet;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		StudentClass s1=new StudentClass(1,"shruti", 22);
		Set<StudentClass> hset=new HashSet<>();
		hset.add(s1);
		System.out.println("before");
		System.out.println(hset);
		s1.age=33;
		System.out.println("after");
		System.out.println(hset);
		System.out.println(hset.contains(s1));
		StudentClass s2=new StudentClass(1, "shruti", 33);
		hset.add(s2);
		System.out.println(hset.contains(s2));
		StudentClass s3=new StudentClass(1, "shruti", 33);
		System.out.println(hset.contains(s3));
		System.out.println(hset);
	}

}


class StudentClass
{
	Integer roll;
	String name;
	Integer age;
	public StudentClass(Integer roll, String name, Integer age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((roll == null) ? 0 : roll.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentClass other = (StudentClass) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll == null) {
			if (other.roll != null)
				return false;
		} else if (!roll.equals(other.roll))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StudentClass [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	
}