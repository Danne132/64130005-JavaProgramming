
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen c1 = new Citizen();
		c1.setId("01");
		c1.setName("An");
		c1.setGender("Male");
		c1.setNation("US");
		c1.setYear((short)2004);
		System.out.print(c1.toString());
		
		Citizen c2 = new Citizen("02", "An", (short)2004, "Male", "VN");
		System.out.print(c2.toString());
	}

}
