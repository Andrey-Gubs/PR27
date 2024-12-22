import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTab {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        // Добавляем
        hashMap.put(1, "Элемент 1");
        hashMap.put(2, "Элемент 2");
        hashMap.put(3, "Элемент 3");
        hashMap.put(4, "Элемент 4");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ключ для поиска элемента: ");
        int searchKey = scanner.nextInt();
        String foundValue = hashMap.get(searchKey);
        if (foundValue != null) {
            System.out.println("Найденный элемент: " + foundValue);
        } else {
            System.out.println("Элемент с ключом " + searchKey + " не найден.");
        }

        // Удаление элемента по ключу
        System.out.print("Введите ключ для удаления элемента: ");
        int removeKey = scanner.nextInt();
        String removedValue = hashMap.remove(removeKey);
        if (removedValue != null) {
            System.out.println("Удаленный элемент: " + removedValue);
        } else {
            System.out.println("Элемент с ключом " + removeKey + " не найден для удаления.");
        }

        // Вывод оставшихся элементов в хеш-таблице
        System.out.println("Оставшиеся элементы в хеш-таблице: " + hashMap);

        scanner.close();
    }
}
