import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private Author author;
    private int year;

    public Book() {
        this.id = 0;
        this.title = "";
        this.author = new Author();
        this.year = 0;
    }

    public Book(int id, String title, Author author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public static void inputBook(Book book) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        book.id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Book Title: ");
        book.title = input.nextLine();
        System.out.print("Enter Author details:\n");
        Author.inputAuthor(book.author);
        System.out.print("Enter Year of Publication: ");
        book.year = input.nextInt();
    }

    public void printBook() {
        System.out.println("Book ID: " + id + "\nTitle: " + title);
        author.printAuthor();
        System.out.println("Year: " + year);
    }

    public String getTitle() {
        return title;
    }
}
