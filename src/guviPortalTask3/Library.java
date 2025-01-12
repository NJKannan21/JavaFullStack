package guviPortalTask3;

public class Library {
	private Book[] books; // Array to store books
    private int bookCount; // Counter to track the number of books

    // Constructor
    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    // Add a book to the library
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Remove a book by ID
    public void removeBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                books[i] = books[bookCount - 1]; // Replace with the last book
                books[bookCount - 1] = null; // Remove last book
                bookCount--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Search for a book by ID
    public Book searchBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null; // Book not found
    }

    // Display all books
    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]);
            }
        }
    }
}
