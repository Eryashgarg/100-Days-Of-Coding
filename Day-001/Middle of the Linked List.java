// link to problem: https://leetcode.com/problems/middle-of-the-linked-list/description/
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null){
            if(fast.next.next == null){
                return slow.next;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
}
