class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}

public class BookManager {
    public static void main(String[] args) {
        // Create an array of Book references
        Book[] library = new Book[3];

        // Populate the array with Book objects
        library[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        library[1] = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        library[2] = new Book("1984", "George Orwell", 1949);

        // Access and display information about each book
        for (int i = 0; i < library.length; i++) {
            System.out.println("Book #" + (i + 1) + ":");
            System.out.println("Title: " + library[i].title);
            System.out.println("Author: " + library[i].author);
            System.out.println("Publication Year: " + library[i].publicationYear);
            System.out.println("---------------------");
        }
    }
}
