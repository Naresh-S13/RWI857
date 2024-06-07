package Oops;
//Method overloading
public class Polymorphism {
    void load(){
        System.out.println("No Argument");
    }
    void load(int a){
        System.out.println("Single Argument");
    }
    void load(String name){
        System.out.println("Single Argument But Different Data Type");
    }
    void load (int a, String name){
        System.out.println("Two Arguments");
    }
}
//Method Overriding
class parent{
    void callme(){
        System.out.println("Parent class");
    }
}
class child extends parent{

    void callme(){
        //super.callme(); --Can use it to call super class method.
        System.out.println("Child Class");
    }
}
