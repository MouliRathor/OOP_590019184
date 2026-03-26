import java.util.*;

public class set {
    public static void main(String[] args) {

        // Normal Set (HashSet - no order)
        Set<Integer> set = new HashSet<>();

        // 🔹 Insertion
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(10); // duplicate (ignored)

        System.out.println("After Insertion: " + set);

        // 🔹 Searching
        if(set.contains(20)) {
            System.out.println("20 is present");
        } else {
            System.out.println("20 is not present");
        }

        // 🔹 Deletion
        set.remove(30);
        System.out.println("After Deletion: " + set);

        // 🔹 Updation (remove + add)
        if(set.contains(40)) {
            set.remove(40);
            set.add(50);
        }

        System.out.println("After Updation: " + set);
    }
}
