import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> arr=new ArrayList<Integer>();
        int n=5;
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr.get(3));
    }
}
