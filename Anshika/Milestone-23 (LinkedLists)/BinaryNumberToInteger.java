//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

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
class BinaryNumberToInteger {
    public int getDecimalValue(ListNode head) {
        
        ListNode temp=head;
        
        int num=0;
        while (temp!=null) {
            num=num<<1;
            num=num+temp.val;
            temp=temp.next;
        }
        
        return num;
    }
}