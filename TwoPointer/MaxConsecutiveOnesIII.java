class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, max=0, zero_count=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0) zero_count++;
            while(zero_count>k){
                //if the element is 3rd '0', decrement the count from the beginning(left) to shrink it
                if(nums[left]==0) zero_count--; 
                left++; //shrinking : move to next index
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
