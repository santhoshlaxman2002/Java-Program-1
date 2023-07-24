import java.lang.reflect.Array;
import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,9,6,8,7};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]==i+1){
                i++;
            }
            else{
                swap(arr,i,arr[i]-1);
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
