class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return f(nums,k) - f(nums,k-1);
    }
    private int f(int[] nums,int k){
        int left=0,count=0,odd=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2==1) odd+=1; //odd means increase the count
            while(odd > k){
                if(nums[left]%2==1) odd-=1; //first element odd : decrease the count -> shrinking
                left++;
            }count+= right-left+1;
        }return count;
    }
}
