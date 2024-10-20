import java.util.Scanner;

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
