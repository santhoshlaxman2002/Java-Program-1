package leetcodeTest;

import java.util.Scanner;

public class matrixRemove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        sc.nextLine();
        char a[][]=new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j]=sc.next().charAt(0);
            }
        }
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                if(a[i][j]=='>'){
                    for(int p=0;p<row;p++){
                        a[p][j+1]='#';
                    }
                    a[i][j]='*';
                }
                if(a[i][j]=='<'){
                    for(int p=0;p<row;p++){
                        a[p][j-1]='#';
                    }
                    a[i][j]='*';
                }
            }
        }
        for (int i = 0; i < row; i++) {
            boolean line=false;
            for (int j = 0; j < col; j++) {
                if(a[i][j]!='#') {
                    System.out.print(a[i][j]+" ");
                    line=true;
                }
            }
            if(line){
                System.out.println();
            }
        }
    }
}
