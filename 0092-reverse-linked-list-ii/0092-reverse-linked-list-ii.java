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
    public ListNode reverseBetween(ListNode head, int left, int right) {
           if (head == null || left == right) {
            return head;
        }
        ListNode start=head;
        ListNode end=head;
        ListNode p1=null;
        int c=1;
        while(c<left)
        {
            p1=start;
            start=start.next;
            c++;
        }
        c=1;
        while(c<right)
        {
            end=end.next;
            c++;
        }
        ListNode p2=end.next;
        ListNode prev = p2;
        ListNode curr = start;

        while (curr != p2) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
          if (p1 != null) {
            p1.next = end;
        } else {
            head = end;
        }

        return head;


    }
}