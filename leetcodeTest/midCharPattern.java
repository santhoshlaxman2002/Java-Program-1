package leetcodeTest;

import java.util.Scanner;

public class midCharPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();
        char[] arr=val.toCharArray();
        int mid=arr.length/2;
        for (int i = 0; i < arr.length; i++) {
            int index=mid;
            for (int j = 0; j < arr.length; j++) {
                if(j>=arr.length-i-1){
                    System.out.print(arr[index]);
                    index++;
                    if(index>arr.length-1){
                        index=0;
                    }
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
