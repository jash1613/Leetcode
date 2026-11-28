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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp!=null&&temp.next!=null)
        {
            int a=temp.val;
            int b=temp.next.val;
            int x=gcd(a,b);
            ListNode n=new ListNode(x);
            n.next=temp.next;
            temp.next=n;
            temp=temp.next.next;
        }
        return head;
    }
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}