import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] A=new int[n];
        for (int i = 0; i < n; i++) {
            A[i]=in.nextInt();
        }
        int target=in.nextInt();
        int ans=binary(A,target);
        System.out.println(ans);
    }

    static int binary(int A[],int target){
        int start=0;
        int end=A.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(A[mid]>target){
                end=mid-1;
            } else if (A[mid]<target) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}
