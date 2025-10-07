abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String getType();
}

class Book extends LibraryResource {
    public Book(String title, String author) {
        super(title, author);
    }

    public String getType() {
        return "Book";
    }
}

class Magazine extends LibraryResource {
    public Magazine(String title, String author) {
        super(title, author);
    }

    public String getType() {
        return "Magazine";
    }
}

class DVD extends LibraryResource {
    public DVD(String title, String author) {
        super(title, author);
    }

    public String getType() {
        return "DVD";
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        LibraryResource[] resources = new LibraryResource[3];
        
        resources[0] = new Book("The Alchemist", "Paulo Coelho");
        resources[1] = new Magazine("National Geographic", "Various");
        resources[2] = new DVD("Inception", "Christopher Nolan");

        for (LibraryResource resource : resources) {
            System.out.println(resource.getType() + ": " + resource.getTitle() + " by " + resource.getAuthor());
        }
    }
}
