/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (1 == numRows) {
            return s;
        }

        StringBuilder result = new StringBuilder();

        int[] flags = new int[s.length()];
        int rowIdx = 1;
        boolean increase = true;
        for (int i=0; i<s.length(); i++) {
            flags[i] = rowIdx;

            if (increase) rowIdx ++;
            else rowIdx --;

            if (rowIdx == numRows) increase = ! increase;
            if (rowIdx == 1 && i > 0) increase = ! increase;
        }

        for (int i=1; i<=numRows; i++) {
            for (int j=0; j<s.length(); j++) {
                if ( i == flags[j]) result.append(s.charAt(j));
            }
        }

        return result.toString();
    }
}
// @lc code=end

