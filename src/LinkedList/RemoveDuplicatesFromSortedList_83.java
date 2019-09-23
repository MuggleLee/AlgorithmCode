package LinkedList;

/**
 * @author Muggle Lee
 * @Date: 2019/9/20 16:36
 * <p>
 * 问题描述：
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 * <p>
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */
public class RemoveDuplicatesFromSortedList_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        if (result == null || result.next == null) {
            return result;
        }
        while (result.next != null) {
            if (result.val == result.next.val) {
                result.next = result.next.next;
            } else {
                result = result.next;
            }
        }
        return head;
    }
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null || head.next != null) {
//            return head;
//        }
//        ListNode tem = new ListNode(0);
//        ListNode result = tem;
//        tem.val = head.val;
//        head = head.next;
//        while (head != null) {
//            if (tem.val == head.val) {
//                head = head.next;
//                continue;
//            }
//            tem.next = head;
//            head = head.next;
//            tem.next.next = null;
//            tem = tem.next;
//        }
//        return result;
//    }
}
