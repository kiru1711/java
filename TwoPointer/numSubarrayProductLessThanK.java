class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0,count=0,prod=1;
        if(k<=1) return 0; //edge case
        for(int right=0;right<nums.length;right++){
            prod *= nums[right]; //continuous product
            while(prod>=k){    
                prod = prod / nums[left]; //shrinking
                left++; //extending
            }count += right-left+1; //length of the current window
        }return count ;
    }
}
