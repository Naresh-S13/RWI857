package ExceptionHandling;

class OddNumberException extends RuntimeException{
    OddNumberException(String s){
        super(s);
    }
}

public class ExceptionHandling {

    public static int Method(int a, int b){
        if(b==0)
            throw new ArithmeticException("Cannot divide the number by Zero");
        return a/b;
    }

    public static void OddNumber(int a){
        if(a%2!=0)
            throw new OddNumberException("The Given Number is ODD");
        System.out.println("The Given Number is EVEN");

    }

    public static void main(String[] args){

        //ArithmeticException
        try {
            int c=Method(10,0);
            System.out.println(c);
        }
        catch (ArithmeticException err){
            System.out.println("Error: "+err.getMessage());
        }

        //ArrayIndexOutOfBoundsException
        int[] arr={5,4,6,9,11};
        int i=(int)Math.floor(Math.random()*10);
        try{
            System.out.println("The Element Present in Index "+i+" is "+arr[i]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }

        //UserDefinedException
        try{
            OddNumber(i);
        }
        catch (ArithmeticException | OddNumberException e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
