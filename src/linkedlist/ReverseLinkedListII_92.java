package linkedlist;

/**
 * @author Muggle Lee
 * @Date: 2019/9/25 13:56
 * <p>
 * 问题描述：
 * Reverse a linked list from position m to n. Do it in one-pass.
 * <p>
 * Note: 1 ≤ m ≤ n ≤ length of list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL, m = 2, n = 4
 * Output: 1->4->3->2->5->NULL
 */
public class ReverseLinkedListII_92 {
//    public ListNode reverseBetween(ListNode head, int m, int n) {
//        ListNode node = head;
////        node.next = head;
//        ListNode tem = new ListNode(0);
//        ListNode result = node;
////        ListNode tem = new ListNode(0);
//        ListNode preTem = new ListNode(0);
//        ListNode pre = tem;
//        int i = 1;
//        if (node != null) {
//            while (m > i) {
//                i++;
////                tem.next = node;
//                node = node.next;
////                tem = tem.next;
//            }
//            ListNode reverseNode = node;
//            tem.next = null;
//            ListNode nextNode = reverseNode.next;
//            for (int j = 1; j <= n - m; j++) {
//                nextNode = node.next;
//                node.next = tem.next;
//                tem.next = node;
//                node = nextNode;
//            }
//            node.next = tem.next;
//        }
//
//        return head;
//    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode node = head;
        ListNode tem = new ListNode(0);
        int i = 1;
        while (m > i) {
            i++;
            node = node.next;
        }
        ListNode temNode = node;
        ListNode nextNode = null;
//        ???
        for (int j = m; j < n; j++) {
            nextNode = temNode.next;
            temNode.next = tem.next;
            tem.next = temNode;
            temNode = nextNode;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(7);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ReverseLinkedListII_92 reverseLinkedListII = new ReverseLinkedListII_92();
        ListNode node = reverseLinkedListII.reverseBetween(listNode, 2, 4);
        System.out.println(node);
    }
}
