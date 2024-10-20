import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Database {
    private static final String FILE_PATH = "db.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void saveData(List<Order> orders) {
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(orders, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createEmptyFile() {
        try {
            // Создание пустого файла
            Files.createFile(Path.of(FILE_PATH));
            System.out.println("Файл " + Database.FILE_PATH + " был успешно создан.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Order> loadData() {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(FILE_PATH));
            return gson.fromJson(reader, new TypeToken<List<Order>>() {
            }.getType());
        } catch (NoSuchFileException e) {
            System.out.println("Файл не найден. Создаем новый файл...");
            createEmptyFile();
            return new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
