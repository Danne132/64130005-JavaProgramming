import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent {
	private static ArrayList<Student> listStudent = new ArrayList<Student>();
	private static int ID = 1; // Auto-increment ID
    private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert new student");
            System.out.println("2. View list of student");
            System.out.println("3. Search student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insertNewStudent();
                    break;
                case 2:
                    viewListOfStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
	
	private static void insertNewStudent() {
		scanner.nextLine(); // Consume newline
		Student news = new Student();
        news.setID(ID++);
        System.out.printf("Name: ");
        String ip = scanner.nextLine();
        news.setFullName(ip);
        System.out.printf("DateOfBirth: ");
        ip = scanner.nextLine();
        news.setDateOfBirth(ip);
        System.out.printf("Native: ");
        ip = scanner.nextLine();
        news.setNative(ip);
        System.out.printf("PhoneNo: ");
        ip = scanner.nextLine();
        news.setPhoneNo(ip);
        System.out.printf("Mobile: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        news.setMobile(num);
        System.out.printf("Class: ");
        ip = scanner.nextLine();
        news.setClass1(ip);		                    
        listStudent.add(news);
	}
	
	private static void viewListOfStudent() {
		System.out.println("View list of student");
        for(Student n : listStudent) {
        	n.Display();
        	System.out.println("----------------------------");
        }
	}
	
	private static void searchStudent() {
		System.out.println("Enter class: ");
		String Class = scanner.next();
		for (Student student : listStudent) {
            if (student.getClass1() == Class) {
                student.Display();
                return;
            }
        }
	}
}
