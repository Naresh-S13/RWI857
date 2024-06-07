package Arrays;

public class FindtheMissingNumber {
    public static void main(String[] args){
        int[] arr={1,2,3,4,6,7,8};
        int[] temp=new int[arr.length+1];
        for(int i=0; i< arr.length+1;i++){
            temp[i]=0;}
        for(int i=0; i<arr.length; i++){
            temp[arr[i]-1]=1;
        }
        int a=0;
        for(int i=0; i<arr.length; i++){
            if (temp[i]==0){
                a=i+1;}}
        System.out.println(a);
        }
    }

