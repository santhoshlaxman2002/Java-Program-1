package Recursion;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();
        String[] arr=val.split(" ");
        String a=arr[0];
        String b=arr[1];
        char[] a1=a.toCharArray();
        char[] a2=b.toCharArray();
        int c1=0;
        int c2=0;
        for(int i=0;i<a1.length;i++){
            if(a1[i]==a2[i]){
                c1++;
                a2[i]='*';
            }
        }
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if(a1[i]==a2[j]){
                    a2[j]='*';
                    c2++;
                    break;
                }
            }
        }
        System.out.println(c1+" "+c2);
    }
}
