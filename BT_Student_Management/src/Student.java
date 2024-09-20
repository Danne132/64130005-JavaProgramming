
public class Student implements IStudent{
	private String FullName;
	private int ID;
	private String DateOfBirth;
	private String Native;
	private String Class1;
	private String PhoneNo;
	private int Mobile;
	
	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNative() {
		return Native;
	}

	public void setNative(String native1) {
		Native = native1;
	}

	public String getClass1() {
		return Class1;
	}

	public void setClass1(String class1) {
		Class1 = class1;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public int getMobile() {
		return Mobile;
	}

	public void setMobile(int mobile) {
		Mobile = mobile;
	}

	@Override
	public void Display() {
		System.out.println("Full Name: " + FullName);
        System.out.println("ID: " + ID);
        System.out.println("Date of Birth: " + DateOfBirth);
        System.out.println("Native: " + Native);
        System.out.println("Class: " + Class1);
        System.out.println("Phone Number " + PhoneNo);
        System.out.println("Mobile: " + Mobile);
		
	}
	
}
