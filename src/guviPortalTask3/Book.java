package guviPortalTask3;

public class Book {
	private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Default availability is true
    }

    // Getters
    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    // Setters
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // To display book details
    @Override 
    // In the given code, whenever you see System.out.println(books[i]) or similar calls.
    // the toString() method is implicitly invoked, making the output readable and meaningful.
    public String toString() {
        return "BookID: " + bookID + ", Title: " + title + ", Author: " + author + 
               ", Available: " + (isAvailable ? "Yes" : "No");
    }
}
