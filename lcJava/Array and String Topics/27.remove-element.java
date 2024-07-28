/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int s=0;
        //for each is better : for (int num: nums)
        for (int f=0; f<nums.length; f++){
            if(nums[f]!= val){
                nums[s]= nums[f];
                s++;
            }
        }
        return s; //s 增加几个就有几个元素
    }
}
//slow-fast pointers, namley copy-over
//The 2nd approach:
//Swap over:swapping the element to be removed with the last element in the array and then reducing the array size
// @lc code=end

