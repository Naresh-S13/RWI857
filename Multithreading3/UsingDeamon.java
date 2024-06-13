package Multithreading3;

public class UsingDeamon extends Thread{

    public void run(){
        if(Thread.currentThread().isDaemon())
        System.out.println(Thread.currentThread().getName()+" Running Daemon Thread");
        else {
            try{Thread.sleep(2000);}
            catch(InterruptedException e){System.out.println(e.getMessage());}
            System.out.println(Thread.currentThread().getName()+" Running User Thread");
        }
    }

    public static void main(String[] args) throws InterruptedException{

        UsingDeamon t1=new UsingDeamon();
        UsingDeamon t2=new UsingDeamon();
        t1.setDaemon(true);
        t1.start();
        t2.setDaemon(false);
        t2.start();
        t2.join();
        System.out.println(t1.isAlive());
    }

}
