import java.util.*;
// Контейнер Library
// Контейнер Library
class Library {
    private final List<LibraryEntity> entities;

    public Library() {
        this.entities = new ArrayList<>();
    }

    public void addEntity(LibraryEntity entity) {
        entities.add(entity);
    }

    public void printAllEntities() {
        for (LibraryEntity entity : entities) {
            System.out.println(entity);
        }
    }

    public void sortByName() {
        entities.sort(Comparator.comparing(LibraryEntity::getName));
    }

    public LibraryEntity searchById(int id) {
        for (LibraryEntity entity : entities) {
            if (entity.getId() == id) {
                return entity;
            }
        }
        return null;
    }
}