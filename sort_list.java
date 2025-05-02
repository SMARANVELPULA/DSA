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
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);


        
        
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
    public ListNode merge (ListNode list1 , ListNode list2){
          ListNode d = new ListNode(-1);
        ListNode temp1 = d;
        // ListNode temp2 = list2;
        while(list1 != null  && list2!=null){
            if(list1.val <= list2.val){
                temp1.next = list1;
                list1 = list1.next;
            }
            else{
                temp1.next = list2;
                list2 = list2.next;
            }
            temp1=temp1.next;
        }
        if(list1!=null){
            temp1.next=list1;
        }
        else{
            temp1.next=list2;
        }

        return d.next;
    }
    
}