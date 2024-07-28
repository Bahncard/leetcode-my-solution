/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                // when a non-1 element is encoutered, compare the count of 1s with the current
                // maxCount
                // set the count for the track of the next sequence of 1s

                maxCount = Math.max(maxCount, count);
                count = 0;

            }
        }
        // if the iteration if completed by a 1s sequence, the count will not be
        // comapred to maxCount in the 'else'
        // we need to do it again here
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
// Greedy + one pass(O(n))

// @lc code=end

