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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head==null)
    return head;
    if(head.next==null)
    return null;
        ListNode c=head;int t =0;
        while(c!=null)
        {
        t++;
        c=c.next;
        }
        int p=t-n+1;
        c=head;
        ListNode prev=null;
        while(p>1 && c!=null)
        {
            prev=c;
            c=c.next;
            p--;

        }
       if(prev == null) {
            head = head.next;
        } else {
            prev.next = c.next;
        }
        c.next = null;
        return head;
    }
}