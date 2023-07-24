import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={1,5,6,8,7,9,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean val=false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    val=true;
                }
            }
            if(!val){
                break;
            }
        }
    }
}
//hello everyone i am santhosh kumar