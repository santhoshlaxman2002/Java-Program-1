import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        int[] arr=new int[5];
//        for (int i = 0; i < 5; i++) {
//            arr[i]= in.nextInt();
//        }
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> arrls=new ArrayList<>(20);
        for(int i=0;i<10;i++){
            arrls.add(in.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arrls.get(i));
        }

    }
    static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[i]=temp;
            i++;
            j--;
        }
    }
}
