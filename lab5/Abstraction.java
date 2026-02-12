abstract class Sample{
    int a =10;
    void f(){
        system.out.println(a);
    }
    abstract void f2();
}
class Child extends Sample{
    void show(){
        super.f();
    }
    void f2(){
        system.out.println(x:"done");
    }
}

public class Abstraction{
    public static void main(string[]args){
        Child s = new Child();
        s.show();
        s.f2();
    }
}