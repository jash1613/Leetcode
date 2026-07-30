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
    public ListNode oddEvenList(ListNode head) {
         if (head == null || head.next == null)
            return head;

     
        ListNode x=head;
        ListNode y=head.next;
        ListNode temp=y;
        while((y!=null && y.next!=null) )
        {
            x.next=y.next;
            x=x.next;
            y.next=x.next;
            y=y.next;
        }
        x.next=temp;
        return head;
    }
}