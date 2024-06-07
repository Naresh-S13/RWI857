package Loops;

public class Loops {
    public static void main(String[] args){
        ForLoop();
        WhileLoop();
        DoWhileLoop();
    }
    static void ForLoop(){
        System.out.print("For Loop : ");
        for(int i=0; i<10; i++)
            System.out.print(i);
    }
    static void WhileLoop(){
        int i=0;
        System.out.println();
        System.out.print("While Loop : ");
        while (i<6){
            System.out.print(i);
            i++;
        }}
    static void DoWhileLoop(){
        System.out.println();
        System.out.println("DoWhile Loop");
        String s="Even Though condition is False I am Printed";
        do {
            System.out.println(s);
        }
        while(false);
    }
}
