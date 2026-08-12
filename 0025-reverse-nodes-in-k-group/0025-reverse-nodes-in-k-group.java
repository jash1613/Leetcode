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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)
        {
            return head;
        }
        ListNode dummy=new ListNode(-1);
        Stack<ListNode> s=new Stack<>();
        ListNode temp=dummy;
        ListNode temp1=head;
       
        while(temp1!=null)
        {
            ListNode check = temp1;

for (int i = 0; i < k; i++) {
    if (check == null) {
        temp.next = temp1;
        return dummy.next;
    }

    check = check.next;
}
             int c=0;
            for(int i=0;i<k;i++)
            {
                s.push(temp1);
                temp1=temp1.next;
                c++;
            }
            if(c==k)
            {
                while(!s.isEmpty())
                {
                    temp.next=s.pop();
                    temp=temp.next;
                    c--;
                }
            }

        }
        temp.next=temp1;
        return dummy.next;
    }
}