import java.util.Scanner;

class Book extends LibraryEntity implements Cloneable {
    private String title;
    private final Author author;
    private int year;

    public Book(int id, String title, Author author, int year) {
        super(id); // Вызов конструктора абстрактного класса
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String getDetails() {
        return "Book ID: " + super.getId() + ", Title: " + title + ", Author: " + author.toString() + ", Year: " + year;
    }

    @Override
    public String toString() {
        return getDetails();
    }

    // Мелкое клонирование
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Глубокое клонирование
    public Book deepClone() {
        return new Book(getId(), title, new Author(author.id, author.name, author.nationality), year);
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

    // Метод для форматирования заголовка книги (ЗАГЛАВНЫЕ БУКВЫ)
    public void formatTitle() {
        this.title = this.title.toUpperCase();
        System.out.println("Formatted Title: " + this.title);
    }
}
