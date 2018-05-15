package com.app.collections;
import java.util.ArrayList;
import java.util.List;

public class CollectionClassTwo {

	public static void main(String[] args) {
		Employee emp1=new Employee(1, "Shruti");
		System.out.println(emp1);
		List <String> l2=emp1.getPhonenumbers();
		l2.add("789"); /*
			This value does not get added into the list that
			has been created in the constructor of the Employee class		
		*/
		System.out.println(emp1);
	}

}


final class Employee
{
	private final Integer empid;
	private final String empname;
	List<String> phonenumbers = new ArrayList<String>();
	public Employee(Integer empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
		phonenumbers.add("123");
		phonenumbers.add("456");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empid == null) ? 0 : empid.hashCode());
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
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
		Employee other = (Employee) obj;
		if (empid == null) {
			if (other.empid != null)
				return false;
		} else if (!empid.equals(other.empid))
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}
	public List<String> getPhonenumbers() {
		List<String> newList=new ArrayList<>();
		newList.addAll(phonenumbers);
		/*return new ArrayList<>(this.phonenumbers);*/
		return newList;
	}
	public Integer getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", phonenumbers=" + phonenumbers + "]";
	}	
}	