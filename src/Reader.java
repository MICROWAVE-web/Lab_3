import java.util.Scanner;

class Reader {
    private int id;
    private String name;
    private String address;

    public Reader(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void inputReader(Reader reader) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Reader ID: ");
        reader.id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Reader Name: ");
        reader.name = input.nextLine();
        System.out.print("Enter Reader Address: ");
        reader.address = input.nextLine();
    }

    public void printReader() {
        System.out.println("Reader ID: " + id + "\nName: " + name + "\nAddress: " + address);
    }

    public String getName() {
        return name;
    }
}
