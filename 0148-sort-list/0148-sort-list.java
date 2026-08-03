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
    public ListNode sortList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ArrayList<Integer> l=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            l.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(l);
        ListNode head1=new ListNode(l.get(0));
        temp=head1;
        for(int i=1;i<l.size();i++)
        {
            ListNode n=new ListNode(l.get(i));
            temp.next=n;
            temp=n;
        }
        return head1;
    }
}