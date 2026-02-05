public class cmnd {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide some arguments!");
            return;
        }

        System.out.println("Total arguments received: " + args.length);

        System.out.println("The array elements are:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Element at index " + i + ": " + args[i]);
        }
    }
}