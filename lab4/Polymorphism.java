package lab4;
class Subject{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

public class Polymorphism {
    public static void main(String args[]){
        Subject d =new Subject();
        System.out.println(d.sum(2, 3));
        System.out.println(d.sum(2, 3, 4));

      
    }

}