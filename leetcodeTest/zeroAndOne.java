package leetcodeTest;

import java.util.ArrayList;
import java.util.Scanner;

public class zeroAndOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();
        int count=0;
        int i=0;
        boolean add=false;
        while(i<n){
            int a=sc.nextInt();
            add=false;
            if(a==1){
                count++;
            }
            if(count==k){
                add=true;
            }
            if(a==0||count==k){
                count=0;
            }
            ans.add(a);
            if(add){
                ans.add(0);
                add=false;
            }
            i++;
        }
        if(add){
            ans.add(0);
        }
        System.out.println(ans);
    }
}
