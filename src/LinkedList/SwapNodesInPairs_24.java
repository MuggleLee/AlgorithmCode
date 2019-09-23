package LinkedList;

/**
 * @author Muggle Lee
 * @Date: 2019/9/19 15:07
 * 问题描述：
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 * Example:
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class SwapNodesInPairs_24 {

    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        ListNode tem = new ListNode(0);
        tem.next = head;
        ListNode result = tem;
        if (head != null && head.next != null) {
            ListNode nextNode = head.next;
            head.next = nextNode.next;
            nextNode.next = head;
            tem.next = nextNode;
            head.next = swapPairs(head.next);
        }
        return result.next;
    }


//    /**
//     * 迭代遍历
//     *
//     * @param head
//     * @return
//     */
//    public ListNode swapPairs(ListNode head) {
//        ListNode tem = new ListNode(0);
//        tem.next = head;
//        ListNode result = tem;
//        while (head != null && head.next != null) {
//            ListNode nextNode = head.next;
//            head.next = nextNode.next;
//            nextNode.next = head;
//            tem.next = nextNode;
//            head = head.next;
//            tem = tem.next.next;
//        }
//        return result.next;
//    }
}