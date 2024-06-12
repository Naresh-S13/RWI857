package Multithreading2;

class note{
    public void print() {
        for (int i = -1; i >= -5; i--) {
            System.out.println(i);
        }}
}

class tables implements Runnable{
    int num;
    tables(int num){
        this.num=num;
    }
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i*num);
        }
    }
}
public class Multithreading2 {
    public static void main(String[] args){

        //Using Thread Class
        note n1=new note();
        Thread t1=new Thread(){
            public void run() {
                n1.print();
            }
        };

        note n2=new note();
        Thread t2=new Thread(){
            public void run() {
                n2.print();
            }};

        //Using Runnable Interface
        tables tab2=new tables(10);
        Thread t3=new Thread(tab2);

        tables tab5=new tables(5);
        Thread t4=new Thread(tab5);

        t4.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        //Starting Threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

