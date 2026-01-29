class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return f(nums,goal) /*till 5*/ - f(nums,goal-1)/*till 4*/;
        //both subtarct for 5 

    }
    private int f(int nums[],int goal){
        if (goal<0) return 0; //edge case
        int left=0,count=0,sum=0;
        for(int right=0;right<nums.length;right++){
            sum += nums[right];
            while(sum > goal){
                sum = sum - nums[left];
                left++;
            }count+= right-left+1;
        }return count;
    }
}
