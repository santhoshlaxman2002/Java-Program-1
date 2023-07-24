import java.util.Arrays;
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Print Target:-");
        int target= in.nextInt();
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int index=0;
        for ( index = 0; index < arr.length; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
