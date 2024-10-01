package StudentManagement;

import java.util.ArrayList;

public class StudentList {
	ArrayList<Student> students = new ArrayList<Student>();
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void deleteStudent(Student s) {
		if(students.contains(s))
			students.remove(s);
	}

	public void In() {
		for (Student student : students) {
			System.out.println(student.name);
		}
	}
	
	
}
