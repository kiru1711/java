import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //sorting
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){ //two more digits needed so -2
            if(i>0&&nums[i]==nums[i-1]) continue; //check duplicates for i 
            int left = i+1; // no repeating elements so next element of i
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if (sum==0) {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while (left<right && nums[left]==nums[left+1]) left++; // dup for left
                while (left<right && nums[right]==nums[right-1]) right--; // dup for right
                left++;
                right--;
            }else if (sum <0)left++;
            else right--;
        }
    } return result;
}
public static void main(String[] args) {
    ThreeSum ts = new ThreeSum();
    int[] nums = {-1, 0, 1, 2, -1, -4};
    System.out.println(ts.threeSum(nums));
}

}


