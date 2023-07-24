package Recursion;

public class ntoone {
    public static void main(String[] args) {
        printn(7);
    }
    public static void printn(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printn(n-1);
    }
}
