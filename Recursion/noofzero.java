package Recursion;

public class noofzero {
    public static void main(String[] args) {
        System.out.println(noz(258301,0));
    }
    public static int noz(int n,int a){
        if(n==0){
            return a;
        }
        return noz(n/10,(n%10==0)?a+1:a);
    }
}
