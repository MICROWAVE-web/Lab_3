import java.util.Scanner;

class Author {
    private int id;
    private String name;
    private String nationality;

    public Author() {
        this.id = 0;
        this.name = "";
        this.nationality = "";
    }

    public Author(int id, String name, String nationality) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
    }

    public static void inputAuthor(Author author) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Author ID: ");
        author.id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Author Name: ");
        author.name = input.nextLine();
        System.out.print("Enter Author Nationality: ");
        author.nationality = input.nextLine();
    }

    public void printAuthor() {
        System.out.println("Author ID: " + id + "\nName: " + name + "\nNationality: " + nationality);
    }
}

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

class Reader {
    private int id;
    private String name;
    private String address;

    public Reader(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void inputReader(Reader reader) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Reader ID: ");
        reader.id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Reader Name: ");
        reader.name = input.nextLine();
        System.out.print("Enter Reader Address: ");
        reader.address = input.nextLine();
    }

    public void printReader() {
        System.out.println("Reader ID: " + id + "\nName: " + name + "\nAddress: " + address);
    }

    public String getName() {
        return name;
    }
}

class Librarian {
    private int id;
    private String name;
    private String position;

    public Librarian(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public static void inputLibrarian(Librarian librarian) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Librarian ID: ");
        librarian.id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Librarian Name: ");
        librarian.name = input.nextLine();
        System.out.print("Enter Librarian Position: ");
        librarian.position = input.nextLine();
    }

    public void printLibrarian() {
        System.out.println("Librarian ID: " + id + "\nName: " + name + "\nPosition: " + position);
    }
}

class Order {
    private int id;
    private final Book book;
    private final Reader reader;
    private final Librarian librarian;
    private String orderDate;

    public Order(int id, Book book, Reader reader, Librarian librarian, String orderDate) {
        this.id = id;
        this.book = book;
        this.reader = reader;
        this.librarian = librarian;
        this.orderDate = orderDate;
    }

    public static void inputOrder(Order order) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        order.id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Book details:\n");
        Book.inputBook(order.book);
        System.out.print("Enter Reader details:\n");
        Reader.inputReader(order.reader);
        System.out.print("Enter Librarian details:\n");
        Librarian.inputLibrarian(order.librarian);
        System.out.print("Enter Order Date (YYYY-MM-DD): ");
        order.orderDate = input.nextLine();
    }

    public void printOrder() {
        System.out.println("Order ID: " + id);
        book.printBook();
        reader.printReader();
        librarian.printLibrarian();
        System.out.println("Order Date: " + orderDate);
    }

    public void sendBook() {
        System.out.println("Sending book '" + book.getTitle() + "' to reader '" + reader.getName() + "' on " + orderDate);
    }

    public void returnBook() {
        System.out.println("Returning book '" + book.getTitle() + "' from reader '" + reader.getName() + "'");
    }
}

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author(1, "Л. Н. Толстой", "Русский");
        Author author2 = new Author(2, "Харуки Мураками", "Японец");

        Book book1 = new Book(1, "Война и мир", author1, 1869);
        Book book2 = new Book(2, "Токийские легенды", author2, 2005);

        Reader reader1 = new Reader(1, "Антон", "г. Барнаул, ул. Попова, дом 16");
        Reader reader2 = new Reader(2, "Никита", "г. Новосибирск, ул. Фрунзе, дом 52");

        Librarian librarian = new Librarian(1, "Анна Николаевна", "Заместитель директора");

        Order order1 = new Order(1, book1, reader1, librarian, "2024-10-01");
        Order order2 = new Order(2, book2, reader2, librarian, "2024-09-30");

        Author newAuthor = new Author(0, "", "");
        Author.inputAuthor(newAuthor);
        newAuthor.printAuthor();

        Book newBook = new Book(0, "", newAuthor, 0);
        Book.inputBook(newBook);
        newBook.printBook();

        Reader newReader = new Reader(0, "", "");
        Reader.inputReader(newReader);
        newReader.printReader();

        Librarian newLibrarian = new Librarian(0, "", "");
        Librarian.inputLibrarian(newLibrarian);
        newLibrarian.printLibrarian();

        Order newOrder = new Order(0, newBook, newReader, newLibrarian, "");
        Order.inputOrder(newOrder);
        newOrder.printOrder();

        newOrder.sendBook();
        newOrder.returnBook();
    }
}