package leetcodeTest;

import java.util.Arrays;
import java.util.Scanner;
public class patternTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();
        String[] arr=val.split(",");
        printPattern(arr);
    }

    public static void printPattern(String[] arr){
        int c=0;
        int map=0;
        while(c<=arr.length){
            c+=map+1;
            map++;
        }
        map--;
        String[][] mat=new String[map][map];
        int p=0;
        for(int j=0;j<map;j++){
            for(int i=j;i<map;i++){
                mat[i][j]=arr[p++];
            }
        }
        for (int i = 0; i < map; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
