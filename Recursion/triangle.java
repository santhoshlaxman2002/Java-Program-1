package Recursion;

import java.util.Arrays;

public class triangle {
    public static void main(String[] args) {
//        trianglePattern(4,0);
        int[] arr={7,8,2,69,4,7,8};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void trianglePattern(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            trianglePattern(row,col+1);
        }
        else {
            System.out.println();
            trianglePattern(row-1,0);
        }
    }


    public static void bubble(int[] arr,int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col+1]<arr[col]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubble(arr,row,col+1);
        }
        else{
            bubble(arr,row-1,0);
        }
    }

    public static void selection(int[] arr,int row,int col,int max){
        if(row==0){
            return;
        }
        if(row>col){
            if(arr[max]<arr[col]){
                selection(arr,row,col+1,col);
            }
            else{
                selection(arr,row,col+1,max);
            }
        }
        else{
            int temp=arr[col-1];
            arr[col-1]=arr[max];
            arr[max]=temp;
            selection(arr,row-1,0,0);
        }
    }
}
