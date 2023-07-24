public class Prime {
    public static void main(String[] args) {
        int i=40;
        for (int j = 0; j <= i; j++) {
            boolean ans=isPrime(j);
            if(ans){
                System.out.println(j);
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
