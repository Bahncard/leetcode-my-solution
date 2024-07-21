#
# @lc app=leetcode id=26 lang=python
#
# [26] Remove Duplicates from Sorted Array
#

# @lc code=start
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)==0 :
            return 0
        # traverse from index 1 to n-1 (the index 0 is unique)
        slow=1
        for fast in range(1, len(nums)):
            # fits into the new array with unique elements
            if nums[fast]!=nums[fast-1] :
                # set the slow pointer
                nums[slow] = nums[fast]
                slow+=1
        #when slow==2, find 1 unique element
        # slow-1 (the unique element found starting from index 1) +1 (the index 0 element) = slow
        return slow

                


        
# @lc code=end

