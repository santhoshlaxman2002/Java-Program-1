import java.util.Scanner;

public class skillrack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] mat=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        int row1=0;
        int row2=x-1;
        int col1=0;
        int col2=y-1;
        int t=0;
        while(row2<a&&col2<b){
            System.out.print(sum(mat,row1,row2,col1,col2)+" ");
            if(col2==b-(b%y)-1){
                col1=0;
                col2=y-1;
                t=1;
            }
            if(col2+y<b&&t==0){
                col1=col2+1;
                col2=col2+y;
            }
            else if(row2+x<a){
                row1=row2+1;
                row2=row2+x;
                t=0;
            }
            else{
                break;
            }
        }
    }

    public static int sum(int[][] mat,int s1,int e1,int s2,int e2){
        int sum=0;
        for(int i=s1;i<=e1;i++){
            for(int j=s2;j<=e2;j++){
                sum+=mat[i][j];
            }
        }
        return sum;
    }
}
    /*
7 7
9 4 7 9 4 2 8
1 3 3 9 7 2 1
9 2 8 6 4 5 2
2 8 3 2 3 3 5
1 1 4 1 9 6 8
7 6 2 7 3 7 9
8 2 9 7 7 7 6
3 2

10 9
5 7 5 3 2 9 5 1 6
3 7 6 2 5 9 6 9 2
3 7 8 9 7 3 9 6 6
6 2 3 9 1 4 5 2 9
9 4 3 7 8 5 2 2 5
9 1 8 9 6 3 2 9 2
8 2 3 8 9 7 3 9 1
1 8 6 9 4 6 5 3 1
3 7 8 9 7 9 2 6 9
8 9 2 5 9 5 3 1 8
4 4
     */