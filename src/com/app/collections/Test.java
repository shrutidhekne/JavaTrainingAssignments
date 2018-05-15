package com.app.collections;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Car c=new Car(4, "sedane", "honda city");
		Car c2=new Car(4, "hatchback", "polo");
		List<Car> myList=new ArrayList<>();
		myList.add(c);
		myList.add(c2);
		System.out.println(myList);
		}
}


class Car
{
	private Integer numoftyres;
	private String typeofcar;
	private String model;
	
	public Car(Integer numoftyres, String typeofcar, String model) {
		super();
		this.numoftyres = numoftyres;
		this.typeofcar = typeofcar;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [numoftyres=" + numoftyres + ", typeofcar=" + typeofcar + ", model=" + model + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((numoftyres == null) ? 0 : numoftyres.hashCode());
		result = prime * result + ((typeofcar == null) ? 0 : typeofcar.hashCode());
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
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (numoftyres == null) {
			if (other.numoftyres != null)
				return false;
		} else if (!numoftyres.equals(other.numoftyres))
			return false;
		if (typeofcar == null) {
			if (other.typeofcar != null)
				return false;
		} else if (!typeofcar.equals(other.typeofcar))
			return false;
		return true;
	}
	
	
	
}