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
public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head;
        do {
            if (slow.next == null || fast.next == null || fast.next.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);
        return true;
    }
}