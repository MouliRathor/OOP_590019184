public class cmndlinesum{
    public static void main(String[] args) {
   
        if (args.length == 0) {
            System.out.println("Please provide numbers as command-line arguments.");
            return;
        }

        int sum = 0;

        
        for (int i = 0; i < args.length; i++) {
            
            sum += Integer.parseInt(args[i]);
        }
        
        System.out.println("The sum of the provided numbers is: " + sum);
    }
}