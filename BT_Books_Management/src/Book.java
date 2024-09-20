import java.util.ArrayList;
import java.util.Scanner;

public class Book implements IBook{
	private int id;
    private String name;
    private String publishDate;
    private String author;
    private String language;
    private float averagePrice; // Read-only property

    private int[] priceList = new int[5]; // Price list to store 5 elements

    // Constructor
    public Book(int id, String name, String publishDate, String author, String language) {
        this.id = id;
        this.name = name;
        this.publishDate = publishDate;
        this.author = author;
        this.language = language;
    }

    // Getter for averagePrice
    public float getAveragePrice() {
        return averagePrice;
    }

    // Implementing the display method from IBook interface
    @Override
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Language: " + language);
        System.out.println("Average Price: " + averagePrice);
    }

    // Method to calculate the average price
    public void calculateAveragePrice() {
        int sum = 0;
        for (int price : priceList) {
            sum += price;
        }
        this.averagePrice = sum / 5.0f;
    }

    // Method to set priceList
    public void setPriceList(int[] prices) {
        this.priceList = prices;
        calculateAveragePrice();
    }
}
