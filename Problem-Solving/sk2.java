import java.util.Scanner;

public class sk2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();
        String[] arr=val.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                if(i<arr[j].length()){
                    System.out.print(arr[j].charAt(i));
                }
            }
            System.out.print(" ");
        }
    }
}