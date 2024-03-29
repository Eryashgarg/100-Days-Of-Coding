// Link to problem: https://leetcode.com/problems/reverse-nodes-in-k-group/description/
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
    public static int size1(ListNode head)
    {
        int size=0;
        while(head!=null)
        {
            head=head.next;
            size++;
        }
        return size;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
     ListNode curr=head;
       ListNode prev=null;
       ListNode nxt=curr;
       int count=0;
       int size=0;
      

      
      

        if(size1(head)<k && nxt!=null)
        {
           
           return nxt;
        }
        else
        {
       while(curr!=null && count<k )
       {
           nxt=curr.next;
           curr.next=prev;
           prev=curr;
           curr=nxt;
           count++;
       }
       if(nxt!=null)
       head.next=reverseKGroup(nxt,k);
        }
       return prev;
        
        
    }
}
