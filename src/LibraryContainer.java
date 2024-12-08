import java.util.ArrayList;
import java.util.List;

public class LibraryContainer {
}

class GenericLibrary<T extends LibraryEntity> {
    private final List<T> items;

    public GenericLibrary() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item.getDetails());
        }
    }
}