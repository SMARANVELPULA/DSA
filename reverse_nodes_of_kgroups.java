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
    public ListNode findK(ListNode node, int k) {
        k--;
        while (k > 0 && node != null) {
            node = node.next;
            k--;
        }
        return node;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = null;
        ListNode next = head;
        while (next != null) {
            prev = curr;
            curr = next;
            next = next.next;
            curr.next = prev;
        }
        return curr;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;
        while (temp != null) {
            ListNode kNode = findK(temp, k);
            if (kNode == null) {
                if (prevNode != null) {
                    prevNode.next = temp;
                }
                break;
            }
            ListNode nextNode = kNode.next;
            kNode.next = null;
            reverse(temp);
            if (temp == head) {
                head = kNode;
            } else {
                prevNode.next = kNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
}
