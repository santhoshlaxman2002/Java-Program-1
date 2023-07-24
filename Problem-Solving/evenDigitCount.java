import java.util.Scanner;

public class evenDigitCount {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        System.out.println(evenDigit(arr));
    }
    static int evenDigit(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            int digit=digCount(element);
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
    static int digCount(int element){
        int count=0;
        while(element!=0){
            count++;
            element=element/10;
        }
        return count;
    }
}
