import java.util.Scanner;

public class richestperson {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]= in.nextInt();
            }
        }
        System.out.println(richest(arr));
    }
    static int richest(int[][] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}
