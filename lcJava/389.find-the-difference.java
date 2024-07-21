/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start


class Solution {
      public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test with sample inputs
        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println(solution.findTheDifference(s1, t1)); // Output: e

        String s2 = "ae";
        String t2 = "aea";
        System.out.println(solution.findTheDifference(s2, t2)); // Output: a
    }

    public char findTheDifference(String s, String t) {
                // an array to strore the number of occurance of each alphabet
                int[] cnt=new int[26];
                for(char c:s.toCharArray()){
                    cnt[c-'a']++;
                }
                for(char c:t.toCharArray()){
                    if(cnt[c-'a']>0){
                        cnt[c-'a']--;
                    }else
                    return c;
                }
                return ' ';
    }
}


// @lc code=end

