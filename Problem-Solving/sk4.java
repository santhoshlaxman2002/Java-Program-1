import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class sk4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
                    boolean row=rowzero(mat,i,j);
                    boolean col=colzero(mat,i,j);
                    if(row&&col){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean rowzero(int[][] mat, int i, int j) {
        for(int h=0;h<mat[0].length;h++){
            if(h!=j&&mat[i][h]==0){
                return false;
            }
        }
        return true;
    }
    public static boolean colzero(int[][] mat, int i, int j) {
        for(int h=0;h<mat.length;h++){
            if(h!=i&&mat[h][j]==0){
                return false;
            }
        }
        return true;
    }
}
