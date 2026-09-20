import java.util.Arrays;

class Solution {
    public int[] numberGame(int[] nums) {
        
        // Sort the array
        Arrays.sort(nums);

        int[] arr = new int[nums.length];

        int j = 0;

        // Take every pair and reverse their order
        for (int i = 0; i < nums.length; i += 2) {
            arr[j++] = nums[i + 1];  // Bob's element
            arr[j++] = nums[i];      // Alice's element
        }

        return arr;
    }
}