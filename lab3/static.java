class Satic{
   
    static int staticValue = 50;

    int instanceValue = 100;
}

public class Main {
    public static void main(String[] args) {
       
        System.out.println("Static Value: " + Static.staticValue);

        Static obj = new Static();
        System.out.println("Non-Static Value: " + obj.instanceValue);
    }
}