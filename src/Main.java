import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример использования производного класса
        SpecialAuthor sa = new SpecialAuthor(1, "Leo Tolstoy", "Russian", "War and Peace");
        System.out.println(sa);

        // Пример использования абстрактного класса и интерфейса
        Book book = new Book(1, "Anna Karenina", new Author(1, "Leo Tolstoy", "Russian"), 1877);
        System.out.println(book);

        // Пример использования клонирования
        try {
            Book clonedBook = (Book) book.clone();
            System.out.println("Cloned Book: " + clonedBook);

            Book deepClonedBook = book.deepClone();
            System.out.println("Deep Cloned Book: " + deepClonedBook);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Пример использования шаблона класса
        GenericLibrary<Book> library = new GenericLibrary<>();
        library.addItem(book);
        library.displayItems();
    }
}
