abstract class LibraryEntity {
    protected int id;

    public LibraryEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public abstract String getDetails(); // Абстрактный метод
}
