class Parent {
    int value = 10; 
}

class Child extends Parent {
    int value = 20; 

    void display() {
        int value = 30; 

        System.out.println("Local value: " + value);

        System.out.println("Current class (Child) value: " + this.value);

        System.out.println("Parent class value: " + super.value);
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}