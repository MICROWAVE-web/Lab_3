import java.util.Scanner;

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
