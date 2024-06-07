package Arrays;

import java.util.*;

public class ReverseAnArray {
    public static void main (String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        int[] arr1=new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0; i--){
            arr1[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
