package Vidu;

import java.util.jar.Attributes.Name;

public class EmployeeData {
	String namee;
	int salary;
	
	public EmployeeData(String name) {
		this.namee = name;
		salary = 5600;
	}

	@Override
	public String toString() {
		return "EmployeeData [name=" + namee + ", salary=" + salary + "]";
	}
}
