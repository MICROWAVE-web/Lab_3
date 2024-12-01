
public class Main {
    public static void main(String[] args) {
        // Пример работы с массивом объектов Author
        System.out.println("Список авторов (одномерный массив):");
        Author[] authors = {
                new Author(1, "Л. Н. Толстой", "Русский"),
                new Author(2, "Харуки Мураками", "Японец"),
                new Author(3, "Джейн Остин", "Англичанка")
        };
        System.out.println("Список авторов:");
        for (Author author : authors) {
            author.printAuthor();
        }

        // Пример работы с двумерным массивом объектов Book *****
        Book[][] library = new Book[2][2]; // Двумерный массив 2x2
        library[0][0] = new Book(1, "Война и мир", authors[0], 1869);
        library[0][1] = new Book(2, "Норвежский лес", authors[1], 1987);
        library[1][0] = new Book(3, "Гордость и предубеждение", authors[2], 1813);
        library[1][1] = new Book(4, "Анна Каренина", authors[0], 1877);

        System.out.println("Список книг (двумерный массив):");
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {
                System.out.println("Книга [" + i + "][" + j + "]:");
                library[i][j].printBook();
                System.out.println();
            }
        }
    }
}
