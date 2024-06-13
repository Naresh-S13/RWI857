package Multithreading3;

//Passing Arguments to Thread Constructor

public class Threading extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is Running Successfully");
    }

    public static void main(String[] args){
        Threading t0=new Threading();
        Threading t1=new Threading();

        ThreadGroup tg=new ThreadGroup("Private");
        Threading t2=new Threading();
        Thread cls=new Thread(t0,t0.getName());
        cls.start();
        Thread cls1=new Thread(tg,t1,"Thread--1");
        cls1.start();
        Thread cls2=new Thread(tg,t2,"2rd Thread");
        cls2.start();

        System.out.println("Thread Group Name - "+tg.getName()+"\n"+"Active Threads - "+tg.activeCount());
        tg.list();
        System.out.println(Thread.currentThread().getName());


    }
}
