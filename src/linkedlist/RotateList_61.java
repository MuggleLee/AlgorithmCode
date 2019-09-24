package linkedlist;

/**
 * @author Muggle Lee
 * @Date: 2019/9/23 13:35
 * 问题描述：
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 * Example 2:
 * <p>
 * Input: 0->1->2->NULL, k = 4
 * Output: 2->0->1->NULL
 * Explanation:
 * rotate 1 steps to the right: 2->0->1->NULL
 * rotate 2 steps to the right: 1->2->0->NULL
 * rotate 3 steps to the right: 0->1->2->NULL
 * rotate 4 steps to the right: 2->0->1->NULL
 */
public class RotateList_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int size = 0;
        ListNode tem = head;
        ListNode node = new ListNode(0);
        ListNode result = node;
        while (tem != null) {
            size++;
            tem = tem.next;
        }
        // 如果旋转的次数等于链表的长度，则直接返回链表对象，不需要改动。
        if (size == k) {
            return head;
        }
        k %= size;
        for (int i = 1; i <= size - k; i++) {
            ListNode nextNode = head.next;
            head.next = null;
            node.next = head;
            head = nextNode;
            node = node.next;
        }
        tem = new ListNode(0);
        ListNode tail = tem;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = null;
            tem.next = head;
            tem = tem.next;
            head = nextNode;
        }
        tem.next = result.next;
        return tail.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(5);
//        ListNode listNode6 = new ListNode(6);
//        ListNode listNode7 = new ListNode(7);
//        ListNode listNode8 = new ListNode(8);
//        ListNode listNode9 = new ListNode(9);
//        ListNode listNode10 = new ListNode(10);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        listNode6.next = listNode7;
//        listNode7.next = listNode8;
//        listNode8.next = listNode9;
//        listNode9.next = listNode10;


        RotateList_61 rotateList = new RotateList_61();
        ListNode node = rotateList.rotateRight(listNode1, 2);
        System.out.println(node);
    }
}
