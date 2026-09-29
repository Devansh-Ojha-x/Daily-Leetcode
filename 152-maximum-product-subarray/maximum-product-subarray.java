class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for(int i=1;i<nums.length;i++){
            int a = max * nums[i];
            int b = min * nums[i];

            max = Math.max(nums[i],Math.max(a,b));
            min = Math.min(nums[i],Math.min(a,b));

            ans = Math.max(ans,max);
        }

        return ans;
    }
}