import java.util.Scanner;

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