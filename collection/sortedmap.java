import java.util.*;

public class  sortedmap {

    public static void main(String[] args) {

        // TreeMap (Sorted Map)
        Map<Integer, Integer> map = new TreeMap<>();

        // 🔹 Insertion
        map.put(4, 400);
        map.put(1, 100);
        map.put(3, 300);
        map.put(2, 200);

        System.out.println("After Insertion (Sorted): " + map);

        // 🔹 Searching
        if(map.containsKey(2)) {
            System.out.println("Key 2 is present with value: " + map.get(2));
        }

        // 🔹 Deletion
        map.remove(3);
        System.out.println("After Deletion: " + map);

        // 🔹 Updation
        map.put(4, 500);
        System.out.println("After Updation: " + map);
    }
}