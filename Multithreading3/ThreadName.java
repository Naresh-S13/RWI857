package Multithreading3;

public class ThreadName extends Thread{
    public void run(){
        try {Thread.sleep(2000);}
        catch(InterruptedException e){System.out.println(e.getMessage());}
        System.out.println("Thread Name - "+currentThread().getName());
    }
    public static void main(String[] args){
        ThreadName t1=new ThreadName();
        t1.setName("Book1");
        t1.start();

        ThreadName t2=new ThreadName();
        t2.setName("Book2");
        t2.start();

    }
}
