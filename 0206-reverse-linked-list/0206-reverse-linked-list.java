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
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, prev = null, temp;
        
        while(cur != null){
            temp = cur.next;
            cur.next = prev;
            //assign cur = prev ie. head
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}