#
# @lc app=leetcode id=303 lang=python
#
# [303] Range Sum Query - Immutable
#

# @lc code=start
class NumArray(object):

    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        #prefix sum
        #self. preSum so it can be referenced in another function 
        self.preSum=[0]*(len(nums)+1) 
        for i in range(len(nums)):
            self.preSum[i+1] = self.preSum[i]+nums[i]
       
    def sumRange(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: int
        """
        #get the sum in a range inclusive of left and right 
        #preSum[n]= the cumulative sums from 0-n-1(inclusive)
        return self.preSum[right+1]-self.preSum[left]
       
        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)
# @lc code=end

