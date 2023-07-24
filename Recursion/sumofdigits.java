package Recursion;

public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(sod(22,0));
    }
    public static int sod(int n,int a){
        if(n==0){
            return a;
        }
        return sod(n/10,a+(n%10));
    }
}
