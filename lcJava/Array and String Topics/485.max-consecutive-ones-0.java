/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int left = 0, right = 0;
        int n = nums.length;
        // 双指针： left作为主要控制点，确保遍历了数组每个元素，right用于找到每个连续 1 的子序列的结束位置
        while (left < n) {//最多执行 n 次，因此是 O(n) left
            // Find the first occurrence of 1 starting from  
            if (nums[left] != 1) {
                left++;
            } else {
                // Move right pointer from left until nums[right] != 1 or end of array
                right = left;
                // 最多执行 n 次，因此是 O(n)
                while (right < n && nums[right] == 1) {
                    right++;
                }
                // Update maxCount with the length of the consecutive ones found
                maxCount = Math.max(maxCount, right - left);
                // Update left to the new position of right
                left = right;
            }
        }
        return maxCount;
    }
}
//while循环取条件里的最高复杂度

// @lc code=end

