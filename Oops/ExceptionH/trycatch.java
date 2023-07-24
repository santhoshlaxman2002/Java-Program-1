package Oops.ExceptionH;

import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            System.out.println(res(a,b));
        }
        catch (ArithmeticException e){
            System.out.println("Exception");
        }
//        System.out.println(res(a,b));
    }
    public static int res(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}
