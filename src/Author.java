import java.util.Scanner;

class Author extends LibraryEntity {
    int id;
    protected String name; // Использование protected
    String nationality;

    // Статическая переменная для отслеживания количества объектов
    private static int authorCount = 0;

    public Author() {
        super(0, "");
        this.id = 0;
        this.name = "";
        this.nationality = "";
        authorCount++;
    }

    public Author(int id, String name, String nationality) {
        super(id, name);
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        authorCount++;
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

    // Статический метод для получения количества созданных объектов
    public static int getAuthorCount() {
        return authorCount;
    }

    // Метод для демонстрации оператора this
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDetails() {
        return "Author ID: " + id + "\nName: " + name + "\nNationality: " + nationality;
    }
}

// Производный класс SpecialAuthor
class SpecialAuthor extends Author {
    private final String award;

    public SpecialAuthor(int id, String name, String nationality, String award) {
        super(id, name, nationality); // Вызов конструктора базового класса
        this.award = award;
    }

    @Override
    public String toString() {
        return super.toString() + ", Award: " + award;
    }
}