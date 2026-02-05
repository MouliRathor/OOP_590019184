import java.util.Scanner;

public class stringcomp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("The strings are exactly the same.");
        } else {
            System.out.println("The strings are different.");
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The strings are the same (ignoring case).");
        }
    }
}
