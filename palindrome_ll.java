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
    public boolean isPalindrome(ListNode head) {
          ListNode temp = getMid(head);
          ListNode temp2 = reverseList(temp);
          int flag = 0;
          ListNode p1 = head;
          ListNode p2 = temp2;
          while(p1!=null && p2!=null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
            flag = 1;
          }
          if(flag == 1){
            return true;
          }
          return false;
    }
    public ListNode getMid(ListNode temp){
        ListNode fast = temp;
        ListNode slow = temp;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
     public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}