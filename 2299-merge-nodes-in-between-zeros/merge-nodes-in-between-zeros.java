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
    public ListNode mergeNodes(ListNode head) {
        ListNode val=new ListNode(),cur=val;
        head=head.next;
        int s=0;
        while(head!=null)
        {
            if(head.val==0)
            {
                cur.next=head;
                head.val=s;
                cur=cur.next;
                s=0;
            }
            else
            {
            s+=head.val;
            }
            head=head.next;
        }
        
    return val.next;
    }
}