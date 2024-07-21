/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
/*
 * https://leetcode.cn/leetbook/read/array-and-string/cacxi/
 */


 class Solution {
    public void reverseString(char[] s) {
        //2 pointers :l at start point, r at end point
        int l=0, r=s.length-1;
        //swap the char in the array of the char
        while(l<r){
            char temp= s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
    }
}
/**
 * 不可以用while(l++<r--)作为loop条件啊喂
 * l++ < r-- 在比较时的确是用 l 和 r 的当前值，然后再自增和自减。但是，l 和 r 在交换时已经改变了。第一次交换后，l 和 r 实际上指向错误的元素
 */
// @lc code=end

