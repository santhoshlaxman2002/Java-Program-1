package Recursion;

public class reverse {
    public static void main(String[] args) {
        System.out.println(rev(1223,0));
    }
    public static int rev(int n,int a){
        if(n==0){
            return a;
        }
        return rev(n/10,(a*10)+n%10);
    }
}
