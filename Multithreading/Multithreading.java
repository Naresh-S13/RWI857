package Multithreading;


class Result extends Thread{
    public void run(){
        int num=5;
        for(int i=1;i<=5;i++){
            try {Thread.sleep(1000);}
            catch (InterruptedException a){System.out.println(a.getMessage());}
            System.out.println(i*num);
        }}
}

class Tables implements Runnable{
    public void run() {
        int num=10;
        for(int i=1;i<=5;i++){

            try {Thread.sleep(1100);}
            catch (InterruptedException a){System.out.println(a.getMessage());}
            System.out.println(i*num);
        }}
}
class Vowels{
    void print(){
        char[] c={'a','e','i','o','u'};
        for (char y : c) {
            System.out.print(y+" ");
        }
        System.out.println();
    }
}
public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        //Thread1 Extends Thread Class
        Result t1=new Result();
        t1.start();

        //Thread2 Implements Runnable Interface
        Tables num=new Tables();
        Thread t2=new Thread(num);
        t2.start();

        if(t1.isAlive() && t2.isAlive()){
            System.out.println("Running....");
        }
        t1.join();
        t2.join();
        if(t1.isAlive() &&t2.isAlive()){
            System.out.println("Running....");
        }

        //Thread3 as Anonymous Class
        Vowels v=new Vowels();
        Thread t3=new Thread(){
            public void run(){
                v.print();
            }};
        t3.start();
        t3.join();
        
        System.out.println("***--- Finish ---***");
    }

}
