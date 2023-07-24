public class infinitebinarysearch {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        System.out.println(ans(arr,9));
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end + ((end - start )+1)*2;
            start=temp;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        int s=start;
        int e=end;
        while(s<=e){
            int mid=s + (e-s)/2;
            if(arr[mid]<target){
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
