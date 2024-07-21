#
# @lc app=leetcode id=389 lang=python3
#
# [389] Find the Difference
#

# @lc code=start
class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        list=[]
        for str in s:
            list.append(str)
        for str in t:
            if str not in list:
                return str
            else:
                list.remove(str)
    def the2ndSolution(self, s: str, t: str) -> str:
        #hashmap to store the occurance of each alphabet

# @lc code=end

