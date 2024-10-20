import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        List<Order> orders = db.loadData();

        if (orders.isEmpty()) {
            // Если данных нет, создаем новые заказы по умолчанию
            Author author1 = new Author(1, "Л. Н. Толстой", "Русский");
            Author author2 = new Author(2, "Харуки Мураками", "Японец");

            Book book1 = new Book(1, "Война и мир", author1, 1869);
            Book book2 = new Book(2, "Токийские легенды", author2, 2005);

            Reader reader1 = new Reader(1, "Антон", "г. Барнаул, ул. Попова, дом 16");
            Reader reader2 = new Reader(2, "Никита", "г. Новосибирск, ул. Фрунзе, дом 52");

            Librarian librarian = new Librarian(1, "Анна Николаевна", "Заместитель директора");

            orders.add(new Order(1, book1, reader1, librarian, "2024-10-01"));
            orders.add(new Order(2, book2, reader2, librarian, "2024-09-30"));
        }

        // Ввод новых данных
        Scanner input = new Scanner(System.in);
        // ... ваш код для ввода данных
        Author newAuthor = new Author(0, "", "");

        Book newBook = new Book(0, "", newAuthor, 0);

        Reader newReader = new Reader(0, "", "");

        Librarian newLibrarian = new Librarian(0, "", "");

        Order newOrder = new Order(0, newBook, newReader, newLibrarian, "");
        Order.inputOrder(newOrder);
        newOrder.printOrder();
        orders.add(newOrder);
        newOrder.sendBook();

        // Сохраняем данные в файл
        db.saveData(orders);

    }
}