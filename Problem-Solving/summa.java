import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class summa {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        ArrayList<String> r=new ArrayList<>();
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] v=arr[i].split("\s");
            String name=v[0];
            r.add(name);
            for(int j=2;j<v.length;j++){
                ans.add(v[j]);
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            boolean print =true;
            for(int j=0;j< ans.size();j++){
                if(i!=j&&ans.get(i).equals((ans.get(j)))){
                    print=false;
                    break;
                }
            }
            for(int j=0;j<r.size();j++){
                if(ans.get(i).equals(r.get(j))){
                    print=false;
                    break;
                }
            }
            if(print){
                System.out.print(ans.get(i)+" ");
            }
        }
    }
}
