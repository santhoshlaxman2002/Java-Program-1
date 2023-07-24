package Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//        permutation("","abc");
        System.out.println(permutationList("","abc"));
    }

    public static void permutation(String procees,String unprocess){
        if(unprocess.isEmpty()){
            System.out.println(procees);
            return;
        }
        for (int i = 0; i <= procees.length(); i++) {
            String first=procees.substring(0,i);
            String second=procees.substring(i,procees.length());
            permutation(first+unprocess.charAt(0)+second,unprocess.substring(1));
        }
    }

    public static ArrayList<String> permutationList(String process,String unprocess){
        if(unprocess.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(process);
            return ans;
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i <= process.length(); i++) {
            String first=process.substring(0,i);
            String second=process.substring(i,process.length());
            ans.addAll(permutationList(first+unprocess.charAt(0)+second,unprocess.substring(1)));
        }
        return ans;
    }
}
