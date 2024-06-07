package string;
import java.util.Arrays;

public class stringProblems {
    public static void main(String[] args){

        //Reverse String
        System.out.println("REVERSE THE GIVEN STRING");
        String s="ReverseME";
        System.out.println("Before - "+s);
        System.out.println("After - "+Reverse(s)+"\n");

        //Palindrome
        System.out.println(Palindrome("Malayalam")+"\n"); //Not Case Sensitive

        //Character occurrence in String
        OccurrenceChar("Welcome"); //Not Case Sensitive
        System.out.println();

        //Remove Duplicate in String
        System.out.println("After - "+RemoveDup("Helloworld")+"\n"); //Not Case Sensitive

        //Number of Vowels in String
        System.out.println("Total Number of Vowels present is - "+NumberOfVowels("HelloWorld")+"\n"); //Case Sensitive

        //Lower Case and Upper Case count in String
        CountLCandUC("Naresh");
        System.out.println();

        //Remove LowerCase
        RemoveLowerCase("friEND");
        System.out.println();

        //First Non Repeat Character in String
        FirstNonRepeat("MyNameisJava"); //Not Case Sensitive
        System.out.println();

        //Anagram                       //Not Case Sensitive
        String s1="AnaGram", s2="GraAnam";
        if(Anagram(s1,s2)){
            System.out.println("The Given String is Anagram");
        }else{
            System.out.println("The Given String is Not Anagram");
        }
    }
    public static String Reverse(String s){
        String r="";
        for(int i=s.length()-1; i>=0; i--){
            r+=s.charAt(i);
        }
        return r;}

    public static String Palindrome(String s){
        System.out.println("PALINDROME");
        System.out.println("String - "+s);
        s=s.toLowerCase();
        String r=Reverse(s);
        if(r.equals(s)){
            return "The Given String is Palindrome";
        }else {
            return "The Given String is Not A Palindrome";
        }
    }

    public static void OccurrenceChar(String s){
        System.out.println("CHARACTER OCCURRENCE COUNT IN THE GIVEN STRING");
        System.out.println("String - "+s);
        String x;
        x=s.toLowerCase();
        for(int i=0;i<x.length(); i++){
            int count=0;
            int dup=0;
            for(int k=0; k<i; k++){
                if(x.charAt(i)==x.charAt(k)){
                    dup=1;
                    break;}}
            //IF dup=1 Do Not Count
            if(dup==0){
            for (int j=i; j<x.length(); j++){
            if(x.charAt(i)==x.charAt(j)){
                count++;
            }}
            System.out.print(s.charAt(i)+"-"+count+"  ");}}
        System.out.println();}

    public static String RemoveDup(String s){
        System.out.println("REMOVE DUPLICATES IN THE GIVEN STRING");
        System.out.println("String - "+s);
        System.out.println("Before - "+s);
        String x;
        String n="";
        x=s.toLowerCase();
        for(int i=0;i<x.length(); i++){
            int dup=0;
            for(int k=0; k<i; k++){
                if(x.charAt(i)==x.charAt(k)){
                    dup=1;
                    break;}}
            if(dup==0){
                    n=n+s.charAt(i);}}
    return n;
        //Another Approach
        /*char[] c =s.toCharArray();
       int index=0;
       for(int i=0; i<c.length; i++){
           int j;
           for(j=0; j<i; j++){
               if(c[i]==c[j]){
                   break;}}
           if(j==i){
               c[index]=c[j];
               index++;}}*/}

    public static int  NumberOfVowels(String s){
        System.out.println("COUNT VOWELS IN THE GIVEN STRING");
        System.out.println("String - "+s);
        int count=0;
        for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            count++;
        }}
        return count;}

    public static void CountLCandUC(String s){
        System.out.println("COUNT LOWERCASE AND UPPERCASE IN THE GIVEN STRING");
        System.out.println("String - "+s);
        String l;
        l=s.toLowerCase();
        int LC=0, UC=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==l.charAt(i)){
                LC++;
            }else{
                UC++;
            }}
        System.out.println("LowerCase - "+LC+"\nUpperCase - "+UC);}

    public static void RemoveLowerCase(String s){
        System.out.println("REMOVE LOWERCASE IN THE GIVEN STRING");
        System.out.println("String - "+s);
        String l,RLC="";
        l=s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=l.charAt(i)){
               RLC=RLC+s.charAt(i);
            }}
        System.out.println("Before - "+s+"\nAfter - "+RLC);}

    public static void FirstNonRepeat(String s){
        System.out.println("FIRST NON REPEAT CHARACTER IN THE GIVEN STRING");
        System.out.println("String - "+s);
        String x;
        x=s.toLowerCase();
        int F=0;
        for(int i=0; i<x.length(); i++){
            int dup=0;
            for (int j=0; j<x.length(); j++){
                if(x.charAt(i)==x.charAt(j)){
                    dup++;
                }}
            if(dup==1){
                F=1;
                System.out.println("The First Non Repeat Character is - "+s.charAt(i));
                break;}}
        if(F==0){
        System.out.println("-1");}}

    public static boolean Anagram(String s1, String s2){
        System.out.println("ANAGRAM");
        System.out.println("String s1 - "+s1+", "+"String s2 - "+s2);
        if(s1.length()!=s2.length()){
            return false;
        }
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i< arr1.length; i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;}

}

