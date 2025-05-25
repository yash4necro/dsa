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
class MergeTwoSortedLLists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode result = list1.val <= list2.val ? new ListNode(list1.val) : new ListNode(list2.val);
        ListNode returnList = result;
        if (list1.val <= list2.val) list1 = list1.next;
        else list2 = list2.next;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                returnList.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                returnList.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            returnList = returnList.next;
        }
        if (list1 != null) returnList.next = list1;
        if (list2 != null) returnList.next = list2;

        return result;
    }
}