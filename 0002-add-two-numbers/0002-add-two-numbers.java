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
        ListNode dummyHead = new ListNode(0);
        ListNode curr=dummyHead;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int x=0;
            if(l1!=null)
            {
               x=l1.val;
            }
            int y=0;
            if(l2!=null)
            {
                y=l2.val;
            }
            int sum=x+y+carry;
            if(sum>=10)
            {
                carry=sum/10;
            }
            else
            {
                carry=0;
            }
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(l1!=null)
            {
                l1=l1.next;
            }
            if(l2!=null)
            {
                l2=l2.next;
            }
        }
        return dummyHead.next;
    }
}