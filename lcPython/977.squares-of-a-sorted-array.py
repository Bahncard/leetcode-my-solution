#
# @lc app=leetcode id=977 lang=python
#
# [977] Squares of a Sorted Array
#

# @lc code=start
class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
    # A non -desreasing order: [1,2,3] √ [-5,-3,0,1]√ [5,5,5]√
    # 2 pointers:left starting from the left side of the array, right...
    # A new array to be assgined by the sorted sequence

        l,r,i=0,len(nums)-1,len(nums)-1
        #initialize an int array
        # O(n)
        result= [0]*len(nums)
        # smaller -> bigger: have the bigger number
        while l<=r: # note the case '=' is included, otherwise the final element will be left out and not assgined to the result[]
            #set the num[r] as the num[i]
            if nums[l]**2 <= nums[r]**2:
                result[i]=nums[r]**2
                r-=1 #the right pointer moves to left by 1
                i-=1 # index of new array decrements
            else:
                result[i]=nums[l]**2
                l+=1
                i-=1
        return result

        
# @lc code=end

