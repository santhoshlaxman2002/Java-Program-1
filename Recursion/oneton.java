package Recursion;

public class oneton {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
