/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String a = new StringBuilder(String.valueOf(x)).reverse().toString();
        String b = String.valueOf(x);
        return a.equals(b);
    }
}
// @lc code=end

