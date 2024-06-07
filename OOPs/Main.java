package Oops;
import PraticeAccessModifiers.*;
class protectedModifier extends AccessModifiers{
    int Java=21;
    private String name="Java";
    void simpleMethod(){
        protectedModifier s=new protectedModifier();
        System.out.println("Protected Variable From Another Package: "+s._Protect); //Protected modifier from another package through subclass

        System.out.println("Private and Default are Accessible Through public Method from Another Package-");
        s.Private();
        System.out.println("\nSAME PACKAGE");
        System.out.println("private Accessible in same class only: "+ name); // But called Outside of Class using Method.

    }

}
public class Main {
    public static void main(String[] args) {

        //Creating Instance for ClassName Class.
        ClassName object0 = new ClassName();
        //Printing two data members and calling method from ClassName class.
        System.out.println(object0.a+"\n"+object0.b);
        object0.Method1();

        //Inheritance
        //single Level
        System.out.println("\nSINGLE LEVEL INHERITANCE");
        Single object1=new Single();
        //Using fields and methods from parent using child class.
        System.out.println(object1.a);
        object1.Method0();
        object1.Method1();
        //Multilevel
        System.out.println("\nMULTI-LEVEL INHERITANCE");
        Multilevel object2=new Multilevel();
        System.out.println(object2.b);
        object2.Method0();
        object2.Method1();
        //Hybrid
        Hierarchical object3=new Hierarchical();
        System.out.println("\nHierarchical INHERITANCE");
        object3.Method0();
        object3.Method1();

        //Polymorphism
        System.out.println("\nPolymorphism");
        //OverLoad
        Polymorphism load=new Polymorphism();
        System.out.println("\nMethod Overloading");
        load.load();
        load.load(12);
        load.load("Java");
        load.load(13,"OverLoad");
        //Override
        System.out.println("\nMethod Overriding");
        child ride=new child();
        ride.callme();
        //Abstraction
        System.out.println("\nABSTRACTION");
        define abs=new define();
        abs.Noname();
        abs.Name();
        //Encapsulation
        Encapsulation dummy=new Encapsulation();
        System.out.println("\nENCAPSULATION");
        dummy.setId(21);
        dummy.setName("Java");
        System.out.println(dummy.getId()+"\n"+dummy.getName());
        //Interface - Achieved Multiple Inheritance
        TestClass inter=new TestClass();
        System.out.println("\nINTERFACE");
        inter.m();
        inter.m1();
        inter.m2();

        //AccessModifers
        System.out.println("\nACCESS MODIFIERS");
        AccessModifiers access=new AccessModifiers();
        System.out.println(access._Public); //Only Public Accessible from Another Package
        protectedModifier protect=new protectedModifier();
        protect.simpleMethod();
        System.out.println("Default variable from same package but called from another Class: "+protect.Java);

    }
}
