/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode temp1=headB;
        int c=0;
        int c1=0;
        while(temp!=null)
        {
            c=c+1;
            temp=temp.next;

        }
        while(temp1!=null)
        {
            c1=c1+1;
            temp1=temp1.next;
        }
        temp=headA;
        temp1=headB;
        if(c>c1)
        {
            while(c!=c1)
            {
                temp=temp.next;
                c--;
            }
        }
        else
        {
            while(c1!=c)
            {
                temp1=temp1.next;
                c1--;
            }
        }
        while(temp!=null && temp1!=null)
        {
            if(temp==temp1)
            {
                return temp;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
        
     return null;
    }
}