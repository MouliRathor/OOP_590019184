//wap to print only unique element after inserting the given vlues (1,2,2,3,1,2,3,4,5,6,5,4) 
import java.util.HashSet;
import java.util.Set;

public class uniqueelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2, 3, 4, 5, 6, 5, 4};
        Set<Integer> uniqueElements = new HashSet<>();
        
        for (int num : arr) {
            uniqueElements.add(num);
        }
        
        System.out.println("Unique elements: " + uniqueElements);
    }
}
