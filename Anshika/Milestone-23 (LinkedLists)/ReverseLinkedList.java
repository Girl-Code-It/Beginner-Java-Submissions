//https://leetcode.com/problems/reverse-linked-list/

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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        
        if (head==null || head.next==null) {
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        
        while (curr.next!=null) {
            
            ListNode ahead=curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=ahead;
        }
        
        curr.next=prev;
        head.next=null;
        head=curr;
        
        return head;
        
    }
}