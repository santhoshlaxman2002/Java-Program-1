public class PerfectSquare {
    public static void main(String[] args) {
        int n=40;
        System.out.printf("%.3f",square(n,3));
    }
    public static double square(int n,int p){
        int start=0;
        int end=n;
        double root=0.0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                root=mid;
                return root;
            }
            else if(mid*mid<n){
                start=mid+1;
               // root=start;
            }
            else{
                end=mid-1;
            }
        }
        double ince=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=ince;
            }
            root-=ince;
            ince/=10;
        }
        return root;
    }
}
