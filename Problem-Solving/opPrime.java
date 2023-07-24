import java.util.Arrays;

public class opPrime {
    public static void main(String[] args) {
        int n=40;
        boolean[] ans=new boolean[n+1];
        prime(n,ans);
    }

    public static void prime(int n, boolean[] ans) {
        for(int i=2;i*i<=n;i++){
            if(!ans[i]){
                for(int j=i+i;j<=n;j=j+i){
                    ans[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!ans[i]){
                System.out.print(i+" ");
            }
        }
    }

}
