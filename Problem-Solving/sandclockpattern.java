public class sandclockpattern {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        int row=2*n;
        int col=n;
        int m=-1;
        int p=n;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(j>m&&j<p){
                    System.out.print("* ");
                }
            }
            System.out.println();
            m++;
            p--;
        }

    }
}
