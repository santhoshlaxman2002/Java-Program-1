import java.util.Scanner;

public class sk3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        int i=1;
        int j=c-2;
        int max=maxVal(mat,0,i,j);
        for(int k=i;k<=j;k++){
            mat[0][k]=max;
        }
        int max2=maxVal(mat,r-1,i,j);
        for(int k=i;k<=j;k++){
            mat[r-1][k]=max2;
        }
        int i1=1,j1=r-2;
        int max3=maxVal1(mat,0,i1,j1);
        for(int k=i1;k<=j1;k++){
            mat[k][0]=max3;
        }
        int max4=maxVal1(mat,c-1,i1,j1);
        for(int k=i1;k<=j1;k++){
            mat[k][c-1]=max4;
        }
        for(int p=0;p<r;p++){
            for(int q=0;q<c;q++){
                System.out.print(mat[p][q]+" ");
            }
            System.out.println();
        }
    }
    public static int maxVal(int a[][],int i,int s,int e){
        int max=a[i][s];
        for(int j=s;j<=e;j++){
            if(max<a[i][j]){
                max=a[i][j];
            }
        }
        return max;
    }
    public static int maxVal1(int a[][],int i,int s,int e){
        int max=a[s][i];
        for(int j=s;j<=e;j++){
            if(a[j][i]>max){
                max=a[j][i];
            }
        }
        return max;
    }
}
//        7 7
//        12 60 23 17 45 25 51
//        93 67 54 41 40 79 81
//        85 38 50 44 95 78 97
//        14 65 49 78 21 50 36
//        56 19 79 78 55 55 49
//        57 56 77 84 92 93 48
//        55 11 12 13 14 15 61
//        5 6
//        25 98 32 68 87 80
//        81 25 57 53 37 89
//        53 23 11 68 43 36
//        98 61 69 43 64 24
//        39 59 39 26 28 83