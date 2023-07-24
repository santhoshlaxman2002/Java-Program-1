package leetcodeTest;

import java.util.HashMap;
import java.util.Scanner;

public class removeOddOccrenceChar {
    public static void main(String[] args) {
        HashMap<Character,Integer> hash=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();
        for(char a:val.toCharArray()){
            if(hash.containsKey(a)){
                hash.remove(a);
            }
            else{
                hash.put(a,1);
                System.out.print(a);
            }
        }
    }
}
