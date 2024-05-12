import java.util.ArrayList;

class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String toString() {
        return "Books{" + "name='" + name + '\'' + ", author='" + author + '\'' + '}';
    }
}

class Library {
    public ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        System.out.println("Book has been added to library");
        this.books.add(book);
    }

    public void issueBook(Book book, String issue_to) {
        System.out.println("Book has been issued from the library to " + issue_to);
        this.books.remove(book);
    }

    public void returnBook(Book b) {
        System.out.println("Book has been returned to library");
        this.books.add(b);
    }
}

public class library_management_system {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("DSA in C", "Sorenson");
        bk.add(b1);

        Book b2 = new Book("DBMS", "Henry Korth");
        bk.add(b2);

        Book b3 = new Book("Digital Electronics", "Morris Mano");
        bk.add(b3);

        Book b4 = new Book("Computer Architecture", "Technical Publication");
        bk.add(b4);

        Library lib = new Library(bk);
        System.out.println(lib.books);
        lib.issueBook(b3, "Karan Shah");
        System.out.println(lib.books);
    }
}