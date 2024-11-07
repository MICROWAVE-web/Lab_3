
public class Main {
    public static void main(String[] args) {
        // 1) Пример работы с массивом объектов Author
        Author[] authors = {
                new Author(1, "Л. Н. Толстой", "Русский"),
                new Author(2, "Харуки Мураками", "Японец"),
                new Author(3, "Джейн Остин", "Англичанка")
        };
        System.out.println("Список авторов:");
        for (Author author : authors) {
            author.printAuthor();
        }

        // 2) Демонстрация возврата целочисленного значения
        System.out.println("Кол-во созданных авторов: " + Author.getAuthorCount());

        // Создание объектов
        Author author = new Author(1, "Л. Н. Толстой", "Русский");

        Book book = new Book(1, "Война и мир", author, 1869);

        // 3) Демонстрация метода this
        author.setName("A. Н. Толстой"); // метод this
        author.printAuthor();

        // 4) Демонстрация обработки строк
        book.printBook();
        book.formatTitle();  // Обработка
    }
}
