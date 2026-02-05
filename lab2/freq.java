import java.util.Scanner;

public class Freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter the element to find the frequency of: ");
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        // 4. Output result
        System.out.println("The element " + target + " appears " + count + " times in the array.");
        
        sc.close();
    }
}