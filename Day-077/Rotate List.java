// Link to problem: https://leetcode.com/problems/rotate-list/description/
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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null) {
            return head;
        }

        int length = 1;
        ListNode tail = head;

        while(tail.next != null) {
            tail = tail.next;
            length++;
        }

        int rotations = k % length;
        int newLastIndex = length - rotations;

        if(rotations == 0) {
            return head;
        }

        ListNode newLastNode = head;
        
        while(newLastIndex > 1) {
            newLastNode = newLastNode.next;
            newLastIndex--;
        }

        ListNode newHead = newLastNode.next;
        newLastNode.next = null;
        tail.next = head;
        head = newHead;

        return head;
    }
}
