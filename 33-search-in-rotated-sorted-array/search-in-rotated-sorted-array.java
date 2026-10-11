class Solution {
    public int bs(int[] nums, int left, int right, int tar) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (nums[mid] == tar) {
            return mid;
        }

        // Left half is sorted
        if (nums[left] <= nums[mid]) {
            if (tar >= nums[left] && tar < nums[mid]) {
                return bs(nums, left, mid - 1, tar);
            } else {
                return bs(nums, mid + 1, right, tar);
            }
        } 
        // Right half is sorted
        else {
            if (tar > nums[mid] && tar <= nums[right]) {
                return bs(nums, mid + 1, right, tar);
            } else {
                return bs(nums, left, mid - 1, tar);
            }
        }
    }

    public int search(int[] nums, int target) {
        return bs(nums, 0, nums.length - 1, target);
    }
}