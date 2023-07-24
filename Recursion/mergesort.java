package Recursion;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr={5,3,6,86,3,5,3,0};
        int[] ans=mSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }
    public static int[] merge(int[] left,int[] right){
        int[] mix=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            mix[k]=right[j];
            k++;
            j++;
        }
        return mix;
    }
}
