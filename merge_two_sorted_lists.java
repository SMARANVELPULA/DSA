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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
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