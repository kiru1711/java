class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1, curr=0, max=0;
        while(left<=right){
            //area = length * breadth 
            curr = (right-left)*Math.min(height[left],height[right]);
            if(curr > max) max = curr;
            if(height[left]>height[right]){
                right-=1;
            }else{
                left+=1;
            }
        } return max;
    }
}
