package numbers;

//package Numbers;

import java.util.Arrays;

public class LargestNumber {
    class Solution {
    public String largestNumber(int[] nums) {
        String[] sNums = new String[nums.length];
        for (int i =0 ; i<nums.length;i++){
            sNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(sNums , (a,b) -> (b+a).compareTo(a+b));
        if(sNums[0].equals("0")) return "0";
        StringBuilder res = new StringBuilder ();
        for(String s : sNums){
            res.append(s);
        } return res.toString();
    }
}
}
