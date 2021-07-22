package HomeWork;
import java.util.*;

public class Phonebook {
    public static void main(String[] args) {

        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("+7123", "Иванов");
        phonebook.put("+7124", "Соколов");
        phonebook.put("+7125", "Яковлев");
        phonebook.put("+7126", "Павлов");
        phonebook.put("+7127", "Иванов");
        phonebook.put("+7128", "Попов");
        phonebook.put("+7129", "Смирнов");
        phonebook.put("+7112", "Кузнецов");

        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            if (entry.getValue().equals("Иванов")) {
                System.out.println(entry.getValue() + ": " + entry.getKey());
            }
        }
    }
}
