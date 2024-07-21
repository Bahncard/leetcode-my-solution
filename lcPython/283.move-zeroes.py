#
# @lc app=leetcode id=283 lang=python
#
# [283] Move Zeroes
#

# @lc code=start
class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # 2 pointers ：slow ->index of the new array
        # the first element can be both 0 and non-0
        slow=0
        for fast in range(len(nums)):
            # filter the elements that fits into the new array 
            if nums[fast]!= 0:
                nums[slow]=nums[fast]
                slow+=1
        # add the 0s to the end of the num:array 
        # the len of the array remains unchanged
        for i in range(slow, len(nums)):
            nums[i]=0
        return nums
        
# @lc code=end

