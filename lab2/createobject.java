public class createobject {
  
    int score = 100;
    String message = "Hello from the Object!";

    public static void main(String[] args) {
      
        createobject obj = new createobject();

        System.out.println("The score is: " + obj.score);
        System.out.println("The message is: " + obj.message);

        obj.score = 200;      //can modify   
        System.out.println("The updated score is: " + obj.score);
    }
}