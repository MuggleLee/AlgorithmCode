package linkedlist;

/**
 * @author Muggle Lee
 * @Date: 2019/9/23 10:18
 * <p>
 * 问题描述：
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * <p>
 * Example:
 * <p>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * <p>
 * Given n will always be valid.
 */
public class RemoveNthNodeFromEndOfList_19 {

    /**
     * 看别人的算法过程
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode node = new ListNode(0);
        ListNode result = node;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while(fast!=null){
            node.next = slow;
            node = node.next;
            slow = slow.next;
            fast = fast.next;
        }
        node.next = slow.next;
        return result.next;
    }

//    public ListNode removeNthFromEnd(ListNode head, int n){
//        ListNode node = reverse(head);
//        ListNode tem = new ListNode(0);
//        ListNode result = tem;
//        int x = 0;
//        while (node != null) {
//            x++;
//            if (x == n) {
//                ListNode nextNode = node.next;
//                tem.next = nextNode;
//                return reverse(result.next);
//            }
//            tem.next = node;
//            node = node.next;
//            tem = tem.next;
//        }
//        return reverse(result.next);
//    }
//
//    public ListNode reverse(ListNode head) {
//        ListNode pre = null;
//        while (head != null) {
//            ListNode nextNode = head.next;
//            head.next = pre;
//            pre = head;
//            head = nextNode;
//        }
//        return pre;
//    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(8);
        ListNode listNode9 = new ListNode(9);
        ListNode listNode10 = new ListNode(10);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;
        listNode9.next = listNode10;


        RemoveNthNodeFromEndOfList_19 removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList_19();
        ListNode node = removeNthNodeFromEndOfList.removeNthFromEnd(listNode1, 2);
        System.out.println(node);
    }
}
