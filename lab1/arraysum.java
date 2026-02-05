import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0; 

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum = sum + numbers[i]; 
        }

        System.out.println("The sum of all elements in the array is: " + sum);

        sc.close();
    }
}