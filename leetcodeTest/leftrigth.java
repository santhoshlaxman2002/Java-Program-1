package leetcodeTest;

import java.util.Arrays;

public class leftrigth {
    public static void main(String[] args) {
        int[] arr={1};
        int[] ans=leftRigthDifference(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] leftRigthDifference(int[] nums) {
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            right+=nums[i];
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            right-=nums[i];
            arr[i]=Math.abs(left-right);
            left+=nums[i];
        }
        return arr;
    }
}
