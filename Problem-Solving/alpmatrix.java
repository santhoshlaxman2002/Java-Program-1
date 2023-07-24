import java.util.ArrayList;
import java.util.Scanner;

public class alpmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        String[] arr=val.split(" ");
        ArrayList<Character> san=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String ans=arr[i].substring(0,arr[i].length()-1);
            int x=Integer.parseInt(ans);
            char y=arr[i].charAt(arr[i].length()-1);
            for(int q=0;q<x;q++){
                san.add(y);
            }
        }
        int i=0;
        for(int p=0;p<a;p++){
            for (int j = 0; j < b; j++) {
                System.out.print(san.get(i)+" ");
                i++;
            }
            System.out.println();
        }
    }
}
