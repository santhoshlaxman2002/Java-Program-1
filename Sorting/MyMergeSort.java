package MergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyMergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,1000,45,75,7,8,9,5,4,5,2,45,0};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i=0;
        int j=0;
        int k=0;
        int[] arr=new int[left.length+ right.length];
        while (i<left.length&&j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while (i< left.length){
            arr[k]=left[i];
            k++;
            i++;
        }
        while (j<right.length){
            arr[k]=right[j];
            k++;
            j++;
        }
        return arr;
    }

}
