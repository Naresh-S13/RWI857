package Arrays;

import java.util.*;

public class Array {
    public static void main(String[] args){
        SingleDimensionArray();
        MultiDimensionalArray();
        SecondLargest();
    }
    public static void SingleDimensionArray(){
        int [] Arr={1,2,3,4,5};  //OR --int[] Arr=new int[5];
        System.out.print("SingleDimArray : ");
        for(int i=0 ; i<Arr.length ; i++){
            System.out.print(Arr[i]);
        }
        System.out.println();
    }
    static void MultiDimensionalArray(){
        char[][] Arr={{'J','a','v','a'},  //
                        {'i','s'},
                        {'G','o','o','d'}
                        };
        System.out.print("MultiDimArray : ");
        for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length; j++){
                System.out.print(Arr[i][j]);
            }}
        System.out.println();
    }

    static void SecondLargest(){
        int[] arr={5,4,3,6,7,1,2};
        /*Arrays.sort(arr);
        int SecondLarge=arr.length-1;
        System.out.println(arr[SecondLarge-1]);*/
        System.out.println("Second Largest Element in Array");
        System.out.println("Input "+Arrays.toString(arr));
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                }
            }
        System.out.print("Output : ");
        System.out.println(arr[arr.length-1]-1);
    }
}
