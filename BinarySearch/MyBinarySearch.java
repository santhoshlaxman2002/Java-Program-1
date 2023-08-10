package RecursionBinarySearch;

public class MyBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9};
        System.out.println(BinarySearch(arr,80,0,arr.length-1));
    }

    private static int BinarySearch(int[] arr, int i,int start,int end) {
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==i){
            return mid;
        }
        if(arr[mid]<i){
            return BinarySearch(arr,i,mid+1,end);
        }
        else{
            return BinarySearch(arr,i,start,mid);
        }
    }
}
