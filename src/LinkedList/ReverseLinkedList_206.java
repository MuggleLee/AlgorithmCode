package LinkedList;

/**
 * @author Muggle Lee
 * @Date: 2019/9/19 13:56
 * 问题描述：
 * Reverse a singly linked list.
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList_206 {
    /**
     * 递归改变每个节点(ListNode)的next指向
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = pre;
            pre = head;
            head = nextNode;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(6);
        ListNode listNode3 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        ReverseLinkedList_206 reverseLinkedList = new ReverseLinkedList_206();
        ListNode node = reverseLinkedList.reverseList(listNode1);
        System.out.println(node);
    }
}