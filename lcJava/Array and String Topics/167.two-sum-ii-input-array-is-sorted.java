/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //sorted array-> two ppointers  
        int l=0, r= numbers.length-1;
      //  int sum = numbers[l]+ numbers[r]; if so the sum will be only calculated once 
        while(l<r){
            int sum = numbers[l]+ numbers[r];
            if (sum == target){
                return new int[]{l+1,r+1};
            }else if(sum < target){
                l++;
            }else{
                r--;
            } 
    }
    return new int[]{-1,-1};
    }
}
//一般对于sorted array，常见解法有binary search，two pointers 
//这里用two pointers：one pointer at the beginning, the other at the end, calculate the sum at each interation
// if the sum is too large, move the right pointer to the left; if the sum is too small, move the left pointer to the right
// @lc code=end

