import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr={9,8,4,2,3,6};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                        swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
