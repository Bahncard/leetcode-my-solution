/*
 * @lc app=leetcode id=561 lang=java
 *
 * [561] Array Partition
 */

// @lc code=start
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        //add the num of the odd index in the array
        for(int i=0; i<nums.length; i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
/**
*  min(ai,bi) Minimum element gets add into the result in sacrifice of maximum element.
* if the sacrifice cannot be avoided, why not sacrifce a smaller one?   
* then  pair a small numbers together, instead of losing the larger numbers
* Sorting & Pairing Adjacent Elements
*/
// @lc code=end

