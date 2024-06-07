package Oops;

public interface Interface {
        void m();
}
interface child0 extends Interface{
        void m1();
}
interface child1 extends Interface{
        void m2();
}
class TestClass implements Interface, child0, child1{  //Multiple Inheritance can be achieved through Interface
    public void m(){
        System.out.println("From parent Interface");
    }
    public void m1(){
        System.out.println("From child0 Interface");
    }
    public void m2(){
        System.out.println("From child1 Interface");
    }
}