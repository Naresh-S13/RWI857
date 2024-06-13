package Multithreading3;

class Temp extends Thread{
    public void run() {
        try {Thread.sleep(2000);}
        catch(InterruptedException e){System.out.println(e.getMessage());}

        System.out.println("Thread-1 State After Reached Method Join() on Thread-2 -- "+ThreadState.t1.getState());
    }
}

public class ThreadState extends Thread{

    public static ThreadState t1;

    public void run() {
        Temp t2=new Temp();
        System.out.println("Thread-2 State After Creation -- "+t2.getState());
        t2.start();
        System.out.println("Thread-2 State After Creation -- "+t2.getState());

        try {Thread.sleep(1000);}
        catch(InterruptedException e){System.out.println(e.getMessage());}

        System.out.println("Thread-2 State While Sleep() -- "+t2.getState());

        try {t2.join();}
        catch(InterruptedException e){System.out.println(e.getMessage());}

        System.out.println("Thread-2 State After Finished it's Execution -- "+t2.getState());
    }

    public static void main(String[] args){
        t1=new ThreadState();
        System.out.println("Thread-1 State After Creation -- "+t1.getState());
        t1.start();
        System.out.println("Thread-1 State After Start -- "+t1.getState());

        try{t1.join();}catch (InterruptedException e){System.out.println(e.getMessage());}

        System.out.println("Thread-1 State After Finished it's Execution -- "+t1.getState());
    }
}
