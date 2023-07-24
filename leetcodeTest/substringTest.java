package leetcodeTest;

import java.util.Scanner;

public class substringTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.println(subStringCount(arr[i]));
        }
    }

    public static int subStringCount(String a){
        int count=a.length();
        for(int i=2;i<=a.length();i++){
            for (int j = 0; j <= a.length()-i; j++) {
                String New=a.substring(j,j+i);
                if(isValid(New)){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isValid(String a){
        for(int i=0;i<a.length();i++){
            if(i!=0&&a.charAt(i)==a.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}
