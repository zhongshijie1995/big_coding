/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add = 0;
        int tmp = 0;

        tmp = l1.val + l2.val + add;
        ListNode result = new ListNode(tmp % 10);
        ListNode p = result;
        add = tmp / 10;
        while(l1.next != null || l2.next != null) {
            if (l1.next == null) {
                tmp = l2.next.val + add;
                p.next = new ListNode(tmp % 10);
                add = tmp / 10;
                l2 = l2.next;
                p = p.next;
            }
            else if (l2.next == null) {
                tmp = l1.next.val + add;
                p.next = new ListNode(tmp % 10);
                add = tmp / 10;
                l1 = l1.next;
                p = p.next;
            }
            else {
                tmp = l1.next.val + l2.next.val + add;
                p.next = new ListNode(tmp % 10);
                add = tmp / 10;
                l1 = l1.next;
                l2 = l2.next;
                p = p.next;
            }
        }
        if (add != 0) {
            p.next = new ListNode(add);
        }

        return result;
    }
}
// @lc code=end

