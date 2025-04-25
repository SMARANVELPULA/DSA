/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean f = false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null ){
            slow =  slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                f = true;
                 break;
            }
           
        }
        slow=head;
        if(f){
            while(slow.next!=null){
                if (slow == fast){
                    return slow;
                }
            slow = slow.next;
            fast = fast.next;
            }
        }
        return null;
    }
    

}