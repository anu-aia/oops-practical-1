public class Book {

    // Instance variables (number and string types)
    String title;
    String author;
    int pages;
    double price;

    // Method to display book details
    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: ₹" + price);
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of Book
        Book book1 = new Book();

        // Assign values
        book1.title = "Atomic Habits";
        book1.author = "James Clear";
        book1.pages = 320;
        book1.price = 499.00;

        // Call the method
        book1.displayBookInfo();
    }
}