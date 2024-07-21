#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#

# @lc code=start
class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        #hashmap
        map={}
        for i in range(len(nums)):
            diff=target-nums[i]
            if diff in map:
                return(i,map[diff])
            map[nums[i]]=i

# @lc code=end