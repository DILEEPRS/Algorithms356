public class book {
    // Instance variables (attributes)
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private double price;

    // Constructor to initialize all fields
    public book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        
    }

    // Getters and setters for each attribute
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Year Published: " + this.yearPublished);
        System.out.println("Price: $" + this.price);
    }
}
