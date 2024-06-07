package Oops;
//Single level
public class Inheritance {
    int a=100, b=200;
    void Method0(){
        System.out.println("From Parent class");
    }
}
class Single extends Inheritance{
    void Method1(){
        System.out.println("From First Child class");
    }
}
//Multilevel
class Multilevel extends Single{
    void Method2(){
        System.out.println("From Second Child Class");
    }
}
//Hierarchical
class Hierarchical extends Single{
    void Method3(){
        System.out.println("From Third Child class");
    }
}
