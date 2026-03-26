import java.util.*;

public class sortedset{
    public static void main(String[] args) {

        // SortedSet (implemented by TreeSet)
        SortedSet<Integer> set = new TreeSet<>();

        // 🔹 Insertion
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        System.out.println("After Insertion (Sorted): " + set);

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
