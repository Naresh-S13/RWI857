package Oops;
//Method Declare
abstract public class Abstraction {
    abstract void Noname();
    void Name(){
        System.out.println("Abstraction Class");
    }
}
//Method Define
class define extends Abstraction{
    void Noname() {
        System.out.println("Define Class");
    }
}
