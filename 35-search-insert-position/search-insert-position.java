class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            // As soon as we find an element equal to or greater than target,
            // this is the exact insertion index.
            if (nums[i] >= target) {
                return i;
            }
        }
        // If all elements are smaller than target, insert at the very end.
        return nums.length;
    }
}