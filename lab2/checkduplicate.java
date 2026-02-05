import java.util.Scanner;

public class checkduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean hasDuplicate = false;

    
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break; 
                }
            }
            if (hasDuplicate) break;
        }

        if (hasDuplicate) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("The array has only unique elements.");
        }
        
        sc.close();
    }
}