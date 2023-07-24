import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={1,2};
        selsection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selsection (int[] arr){
        for(int i=0;i<arr.length;i++){
            int last= arr.length-i-1;
            int max=maxIndex(arr,last);
            swap(arr,last,max);
        }
    }
    public static void swap(int[] arr,int last,int max){
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
    public static int maxIndex(int[] arr, int last) {
        int max=0;
        for(int i=1;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
