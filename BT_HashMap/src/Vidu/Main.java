package Vidu;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, EmployeeData> staffObj = new HashMap<String, EmployeeData>();
		staffObj.put("101", new EmployeeData("An"));
		staffObj.put("102", new EmployeeData("Haha"));
	}

}
