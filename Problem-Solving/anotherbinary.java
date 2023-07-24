import java.util.Arrays;

public class anotherbinary {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] ans=findIndex(arr,9);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findIndex(int[][] arr,int target){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length&&col>=0){
            if(arr[row][col]<target){
                row++;
            }
            else if(arr[row][col]>target){
                col--;
            }
            else{
                return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
