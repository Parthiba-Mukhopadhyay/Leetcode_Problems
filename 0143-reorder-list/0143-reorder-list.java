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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!= null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode head1=mid;
        while (head1!=null)
        {
            ListNode nxt=head1.next;
            head1.next=prev;
            prev=head1;
            head1=nxt;
        }
        mid=prev;
        while(mid!=null)
        {
            ListNode temp1=head.next;
            ListNode temp2=mid.next;
            
            head.next=mid;
            mid.next=temp1;
            
            head=temp1;
            mid=temp2;
            
        }
    }
}