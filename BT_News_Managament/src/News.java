import java.lang.classfile.instruction.IncrementInstruction;
import java.util.ArrayList;

public class News implements INews{
	private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private ArrayList<Integer> RateList;

    public News() {
        RateList = new ArrayList<>();
    }

    // Getters and Setters for all properties except AverageRate (only getter for AverageRate)
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    // Method to display news information
    @Override
    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("Publish Date: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("Average Rate: " + AverageRate);
    }

    // Method to calculate the average rate from RateList
    public void Calculate() {
        int sum = 0;
        for (int rate : RateList) {
            sum += rate;
        }
        AverageRate = sum / RateList.size();
    }

    // Method to add rates to RateList
    public void addRate(int rate) {
        RateList.add(rate);
    }
}
