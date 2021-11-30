/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int lk = 0;
        for (int rk = 0; rk < s.length(); rk ++) {
            char ch = s.charAt(rk);

            if (map.containsKey(ch)) {
                lk = Math.max(map.get(ch) + 1, lk);
            }

            result = Math.max(result, rk - lk + 1);
            map.put(ch, rk);
        }

        return result;
    }
}
// @lc code=end

