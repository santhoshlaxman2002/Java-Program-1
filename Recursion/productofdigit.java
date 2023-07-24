package Recursion;

public class productofdigit {
    public static void main(String[] args) {
        System.out.println(pod(1234,1));
    }
    public static int pod(int n,int a){
        if(n==0){
            return a;
        }
        return pod(n/10,a*(n%10));
    }
}
