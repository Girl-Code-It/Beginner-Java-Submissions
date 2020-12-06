//https://leetcode.com/problems/merge-two-sorted-lists/submissions/

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
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode temp1=l1, temp2=l2;
        ListNode head=new ListNode();
        
        while (temp1!=null && temp2!=null) {
            if (temp1.val<=temp2.val) {
                addLast (head,temp1.val);
                temp1=temp1.next;
            } else {
                addLast (head,temp2.val);
                temp2=temp2.next;
            }
        }
        
        while (temp1!=null) {
            addLast (head,temp1.val);
            temp1=temp1.next;
        }
        
        while (temp2!=null) {
            addLast (head,temp2.val);
            temp2=temp2.next;
        }
        
        head=head.next;
        return head;
    }
    
    void addLast (ListNode head, int val) {
        
        ListNode temp=new ListNode (val);
        
        if (head==null) {
            head=temp;
        } else {
            ListNode temp1=head;
            
            while (temp1.next!=null) {
                temp1=temp1.next;
            }
            
            temp1.next=temp;
        }
    }
}