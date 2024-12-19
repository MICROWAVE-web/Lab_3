import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавление объектов в контейнерЫ
        Author author1 = new Author(1, "Лев Толстой", "Русский");
        Book book1 = new Book(2, "Война и мир", author1, 1869);
        Author author2 = new Author(3, "Джейн Остин", "Англичанка");
        Book book2 = new Book(4, "Гордость и предубеждение", author2, 1813);

        library.addEntity(author1);
        library.addEntity(book1);
        library.addEntity(author2);
        library.addEntity(book2);

        System.out.println("Все объекты в библиотеке:");
        library.printAllEntities();

        System.out.println("\nСортировка по имени:");
        library.sortByName();
        library.printAllEntities();

        System.out.println("\nПоиск объекта с ID = 2:");
        LibraryEntity foundEntity = library.searchById(2);
        if (foundEntity != null) {
            System.out.println("Найден объект: " + foundEntity);
        } else {
            System.out.println("Объект с таким ID не найден.");
        }
    }
}
