package Recursion;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr={8,7,5,2,6,9,4,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=low+(high-low)/2;
        int pivot=nums[mid];
        while(start<=end){
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if (start <= end) {
                int t=nums[start];
                nums[start]=nums[end];
                nums[end]=t;
                start++;
                end--;
            }
        }
        sort(nums,low,end);
        sort(nums,start,high);
    }
}
