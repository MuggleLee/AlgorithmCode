package linkedlist;

/**
 * @author Muggle Lee
 * @Date: 2019/9/20 14:58
 * 问题描述：
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists_21 {
    /**
     * 注意题目的条件，两个链表都是有序的，所以只需要比较两个链表的第一个对象
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tem = result;
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val){
                tem.next = l1;
                l1 = l1.next;
            }else {
                tem.next = l2;
                l2 = l2.next;
            }
            tem = tem.next;
        }
        if (l1 == null) {
            tem.next = l2;
        }
        if (l2 == null) {
            tem.next = l1;
        }
        return result.next;
    }
}
