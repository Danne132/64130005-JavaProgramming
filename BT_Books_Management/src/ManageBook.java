import java.util.ArrayList;
import java.util.Scanner;

public class ManageBook {
	private static ArrayList<Book> books = new ArrayList<>();
    private static int bookId = 1; // Auto-increment ID
    private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert new book");
            System.out.println("2. View list of books");
            System.out.println("3. Average Price");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insertNewBook();
                    break;
                case 2:
                    viewListOfBooks();
                    break;
                case 3:
                    displayAveragePrice();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
	
	private static void insertNewBook() {
        scanner.nextLine(); // Consume newline

        System.out.print("Enter book name: ");
        String name = scanner.nextLine();

        System.out.print("Enter publish date: ");
        String publishDate = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter language: ");
        String language = scanner.nextLine();

        // Enter prices
        int[] prices = new int[5];
        System.out.println("Enter 5 prices:");
        for (int i = 0; i < 5; i++) {
            prices[i] = scanner.nextInt();
        }

        // Create a new Book and add to the list
        Book newBook = new Book(bookId++, name, publishDate, author, language);
        newBook.setPriceList(prices);
        books.add(newBook);
        System.out.println("Book added successfully!");
    }

    // Method to view all books
    private static void viewListOfBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.display();
                System.out.println("---------------------");
            }
        }
    }

    // Method to display the average price of all books
    private static void displayAveragePrice() {
        if (books.isEmpty()) {
            System.out.println("No books available to calculate average price.");
        } else {
            for (Book book : books) {
                book.display();
                System.out.println("---------------------");
            }
        }
    }

}
