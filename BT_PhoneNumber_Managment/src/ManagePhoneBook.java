import java.util.Scanner;

public class ManagePhoneBook {

	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
            System.out.println("1. Insert Phone");
            System.out.println("2. Remove Phone");
            System.out.println("3. Update Phone");
            System.out.println("4. Search Phone");
            System.out.println("5. Sort");
            System.out.println("6. Show");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Đọc bỏ dòng trống sau khi nhập số
            switch (choice) {
            case 1:
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter phone: ");
                String phone = scanner.nextLine();
                phoneBook.insertPhone(name, phone);
                break;
            case 2:
                System.out.print("Enter name to remove: ");
                name = scanner.nextLine();
                phoneBook.removePhone(name);
                break;
            case 3:
                System.out.print("Enter name to update: ");
                name = scanner.nextLine();
                System.out.print("Enter new phone: ");
                String newphone = scanner.nextLine();
                phoneBook.updatePhone(name, newphone);
                break;
            case 4:
                System.out.print("Enter name to search: ");
                name = scanner.nextLine();
                phoneBook.searchPhone(name);
                break;
            case 5:
                phoneBook.sort();
                System.out.println("Sorted Phone List: ");
                for (String entry : phoneBook.PhoneList) {
                    System.out.println(entry);
                }
                break;
            case 6:
            	if (phoneBook.PhoneList.isEmpty()) {
                    System.out.println("Phone list is empty.");
                } else {
                    for (String entry : phoneBook.PhoneList) {
                        System.out.println(entry);
                    }
                };
                break;
            case 7:
            	scanner.close();
                return;
        	}	
        }
	}

}
