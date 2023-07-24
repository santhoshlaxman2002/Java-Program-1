package Recursion;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
       ArrayList<String> ans= subseqRet("","776");
        System.out.println(ans);
    }

    public static void subseq(String process,String unprocess){
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        subseq(process+unprocess.charAt(0),unprocess.substring(1));
        subseq(process,unprocess.substring(1));
    }

    public static ArrayList<String> subseqRet(String process, String unprocess){
        if(unprocess.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(process);
            return ans;
        }
        ArrayList<String> left=subseqRet(process+unprocess.charAt(0),unprocess.substring(1));
        ArrayList<String> right=subseqRet(process,unprocess.substring(1));
        left.addAll(right);
        return left;
    }
}
