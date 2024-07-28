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
//注意：不要忘掉另一个return，每个条件对应肯定都有return
//HashMap别写错：用wrapper class， 而且形式是开头大写

// @lc code=end

