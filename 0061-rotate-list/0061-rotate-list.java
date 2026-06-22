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
        if(head==null||head.next==null)
        {
            return head;
        }
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c=c+1;
            temp=temp.next;
        }
        temp=head;
        ListNode prev=head;
        for(int i=0;i<k%c;i++)
        {
            temp=head;
            prev=null;
            while(temp.next!=null)
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            temp.next=head;
            head=temp;
        }
        return head;
    }
}