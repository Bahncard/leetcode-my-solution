/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        //move the val to the end of the array
        int newLength=nums.length;
        for (int i = 0; i < newLength; i++) {
            if(nums[i] == val){
                nums[i]= nums[newLength-1]; 
                newLength--;//contract the arr_length
                i--; //go one element back to check if the swapped the elements again fits the requirement.
                    // so in the next iteration i++, it goes exactly back to the i in the last iteration

            }
        }
        return newLength;
    }
}
 
 
/*
Swap over:swapping the element to be removed with the last element in the array and then reducing the array size
不需要将当前位置的值放到size-1位置，因为实际上是在缩短数组的有效长度，直接用末端的值覆盖要删除的位置，然后缩短数组的长度即可。
这种方法的重点是避免多余的移动操作，而不是维护原始顺序。
 */
// @lc code=end

