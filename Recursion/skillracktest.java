package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class skillracktest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();
        String[] arr=val.split("[+-]");
        System.out.println(Arrays.toString(arr));
        int sum=0;
        sum += Integer.parseInt(arr[0]);
        int a=1;
        for(int i=0;i<val.length();i++){
            if(val.charAt(i)=='+'||val.charAt(i)=='-'){
                if(val.charAt(i)=='+'){
                    sum-=Integer.parseInt(arr[a]);
                    a++;
                }
                else{
                    sum+=Integer.parseInt(arr[a]);
                    a++;
                }
            }
        }
        System.out.println(sum);
    }
}
