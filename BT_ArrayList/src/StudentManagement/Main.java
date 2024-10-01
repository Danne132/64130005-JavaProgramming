package StudentManagement;

public class Main {

	public static void main(String[] args) {
		StudentList sList = new StudentList();
		Student s1 = new Student("An", "64.CNTT-CLC2", 6.0);
		sList.addStudent(s1);
		sList.In();
		sList.deleteStudent(s1);
		sList.In();
	}

}
