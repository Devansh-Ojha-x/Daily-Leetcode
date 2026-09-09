import java.util.*;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        long psum = 0;
        if(map.size() == k) {
            psum = sum;
        }
        
        for(int i = k; i < n; i++) {
            sum += nums[i];
            sum -= nums[i-k];
            map.put(nums[i-k], map.get(nums[i-k]) - 1);
            if(map.get(nums[i-k]) == 0) {
                map.remove(nums[i-k]);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.size() == k) {
                psum = Math.max(sum, psum);
            }
        }
        return psum;
    }
}