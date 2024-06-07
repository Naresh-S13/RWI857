package Arrays;

import java.util.*;

public class Sorts {
    public static void main(String[] args){
        System.out.println("SelectionSort--");
        SelectionSort();
        System.out.println("BubbleSort--");
        BubbleSort();
        System.out.println("InsertionSort--");
        InsertionSort();
        System.out.println("MergeSort--");
        int[] arr={29, 72, 98, 13, 87, 66, 52, 51, 36};
        System.out.println(Arrays.toString(MergeSort(arr)));
    }
    //SelectionSort--
    static void SelectionSort(){
        int[] arr={29, 72, 98, 13, 87, 66, 52, 51, 36};
        for(int i=0; i<arr.length-1; i++){
            int min=i;
            for(int j=i+1; j<arr.length; j++){
            if(arr[min]>arr[j]){
                min=j;
            }}
        int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;}
        System.out.println(Arrays.toString(arr));
    }
    //BubbleSort--
    static public void BubbleSort(){
        int[] arr={29, 72, 98, 13, 87, 66, 52, 51, 36};
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }}}
        System.out.println(Arrays.toString(arr));
    }
    //InsertionSort--
    static public void InsertionSort(){
        int[] arr={29, 72, 98, 13, 87, 66, 52, 51, 36};
        int temp;
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }}}
        System.out.println(Arrays.toString(arr));
    }
    //MergeSort--
    static int[] MergeSort(int[] arr){
        if(arr.length==1)
            return arr;

        int mid=arr.length/2;
        int[] left=MergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    static int[] merge(int[]l, int[]r){

        int[] join=new int[l.length+r.length];
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length) {
            if (l[i] < r[j]) {
                join[k] = l[i];
                k++;
                i++;
            } else {
                join[k] = r[j];
                k++;
                j++;
            }}
            while (i<l.length){
                join[k]=l[i];
                k++;
                i++;}
            while (j<r.length){
                join[k]=r[j];
                k++;
                j++;}
        return join;
    }
}
