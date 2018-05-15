package com.app.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionClassThree {

	public static void main(String[] args) {
		Student s=new Student(1, "Shruti");
		System.out.println("Before");
		System.out.println(s);
		List<String> mainList=s.getSubjects();
		mainList.add("C");
		System.out.println("After");
		System.out.println(s);
	}

}


class Student
{
	private Integer studentid;
	private String studentname;
	List<String> subjects=new ArrayList<>();
	public Student(Integer studentid, String studentname) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		subjects.add("Java");
		subjects.add("CPP");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentid == null) ? 0 : studentid.hashCode());
		result = prime * result + ((studentname == null) ? 0 : studentname.hashCode());
		result = prime * result + ((subjects == null) ? 0 : subjects.hashCode());
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
		Student other = (Student) obj;
		if (studentid == null) {
			if (other.studentid != null)
				return false;
		} else if (!studentid.equals(other.studentid))
			return false;
		if (studentname == null) {
			if (other.studentname != null)
				return false;
		} else if (!studentname.equals(other.studentname))
			return false;
		if (subjects == null) {
			if (other.subjects != null)
				return false;
		} else if (!subjects.equals(other.subjects))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", subjects=" + subjects + "]";
	}
	public Integer getStudentid() {
		return studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public List<String> getSubjects() {
		return new ArrayList<>(this.subjects);
	}
}