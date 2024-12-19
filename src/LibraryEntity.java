import java.util.*;

// Базовый класс
abstract class LibraryEntity {
    protected int id;
    protected String name;

    public LibraryEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract String getDetails();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}