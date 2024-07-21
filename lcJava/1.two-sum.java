/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Initialize a HashMap - key: array num, value: array index
        Map<Integer, Integer> hashmap = new HashMap<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // If the difference between the current element and the target is present in the hashmap, find the two nums
            if (hashmap.containsKey(target - nums[i])) {
                // Return the indices of the two numbers
                return new int[] {hashmap.get(target - nums[i]), i};
            }
            // Add the current element into the key, current index into the value
            hashmap.put(nums[i], i);
        }
        return null;
    }
}
/**
 * 1. The order of indices in the return array should match the problem statement,
 * (i.e., the first index should be the one stored in the hashmap and the second should be the current index)
 */
// @lc code=end

