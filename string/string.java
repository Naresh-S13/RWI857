package string;

public class string {
    public static void main(String[] args) {
        String s = new String("Java");
        String s0 = new String("JavaScript");
        String s1 = "Python";
        String s2 = "c, c++";
        String s3 = "Python";
        System.out.println(s.toUpperCase() + "\n" + s0.toLowerCase());
        System.out.println(s1.concat(" " + s2));
        System.out.println(s3.indexOf('h'));
        System.out.println(s3.substring(4));
        System.out.println(s2.replace('+', 'p'));

        stringBuffer();
        stringBuilder();
    }
    public static void stringBuffer(){
        StringBuffer s=new StringBuffer("Java");
        s.append(" and Python");
        System.out.println(s);

        StringBuilder s1=new StringBuilder(s);
        System.out.println("StringBuilder "+s1);
    }
    public static void stringBuilder(){
        StringBuilder s=new StringBuilder("Java and Python");
        s.delete(4, s.length());
        System.out.println(s);

        StringBuffer s1=new StringBuffer(s);
        System.out.println("StringBuffer "+s1);

    }
}
