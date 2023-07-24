import java.util.Scanner;

public class celing {
    public static int binary(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid<key){
                low=mid+1;
            } else if (mid>key) {
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //sc.nextLine();
        int key=sc.nextInt();
        //sc.nextLine();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
//        System.out.println("hell");
            int ans=binary(arr,key);
        System.out.println(ans);
    }
}
