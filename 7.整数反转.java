/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int tmp = 0;
        try {
            tmp = Integer.valueOf(
                new StringBuffer(
                    String.valueOf(x).replace("-", "")
                ).reverse().toString()
            );
        }
        catch (Exception e) {}
        return x>0 ? tmp: -tmp;
    }
}
// @lc code=end

