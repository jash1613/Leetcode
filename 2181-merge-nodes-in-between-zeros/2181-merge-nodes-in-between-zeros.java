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
       ListNode temp=new ListNode(-1);
       ListNode temp1=head,temp2=head.next,tail=temp;
       int s=0;
       while(temp2!=null)
       {
        if(temp1.val==0&&temp2.val==0)
        {
            ListNode newnode=new ListNode(s);
            if(temp.val==-1)
            {
                temp=tail=newnode;
            }
            else
            {
                tail.next=newnode;
                tail=newnode;
            }
            s=0;
            temp1=temp2;
        }
        s=s+temp2.val;
        temp2=temp2.next;
       }
       return temp; 
    }
}