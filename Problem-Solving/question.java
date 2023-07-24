public class question {
    public static void main(String[] args) {
        String a="SANTHOSHKUMAR";//manager //panamericatravelsking //
        String b="LKJHSANTHOSHASDF";//agegomanage //catmilknamepankilltravel //
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        int i=0;
        int x=0;
        while(i<arr2.length){

            int c=0;
            int j=0;
            while(j<arr1.length){
                if(i!=arr2.length-1&&j!=arr1.length-1&&arr2[i]==arr1[j]&&arr2[i+1]==arr1[j+1]) {
                    int f=i;
                    int r=j;
                    while(f<arr2.length&&r<arr1.length&&arr2[f]==arr1[r]){
                        System.out.print(arr1[r]);
                        c++;
                        x++;
                        f++;
                        r++;
                    }
                    j=r;
                    i=f-1;
                    j--;
                }
                j++;
            }
            i++;
            if(c!=0)
            System.out.println();
        }
        if(x==0){
            System.out.println("-1");
        }
    }
}
