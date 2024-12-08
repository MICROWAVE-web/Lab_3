import java.util.ArrayList;
import java.util.List;
class LibraryContainer<T extends LibraryEntity> {
    private final List<T> items;

    public LibraryContainer() {
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