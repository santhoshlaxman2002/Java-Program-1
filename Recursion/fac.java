package Recursion;

public class fac {
    public static void main(String[] args) {
        System.out.println(fact(4,1));
    }
    public static int fact(int n,int a){
        if(n==1){
            return a;
        }
        return fact(n-1,a*n);
    }
}
