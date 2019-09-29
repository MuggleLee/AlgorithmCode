package linkedlist;

/**
 * @author Muggle Lee
 * @Date: 2019/9/24 17:27
 * 问题描述：
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2->3->3->4->4->5
 * Output: 1->2->5
 * Example 2:
 * <p>
 * Input: 1->1->1->2->3
 * Output: 2->3
 */
public class RemoveDuplicatesFromSortedListII_82 {
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode node = new ListNode(0);
//        ListNode result = node;
//        ListNode nextNode = null;
//        int sentry = head.val;
//        boolean flag = false;
//        while (head != null) {
//            nextNode = head.next;
//            if (nextNode == null) {
//                node.next = flag ? null : head;
//                return result.next;
//            }
//            if (sentry == nextNode.val) {
//                head = nextNode;
//                flag = true;
//                continue;
//            }
//            if (flag) {
//                head = nextNode;
//                flag = false;
//                sentry = head.val;
//                continue;
//            }
//            sentry = nextNode.val;
//            head.next = null;
//            node.next = head;
//            head = nextNode;
//            node = node.next;
//        }
//        return result.next;
//    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode result = node;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                head = head.next;
                node.next = head;
            }else{
                head = head.next;
                node = node.next;
            }
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        RemoveDuplicatesFromSortedListII_82 removeDuplicatesFromSortedListII = new RemoveDuplicatesFromSortedListII_82();
        ListNode node = removeDuplicatesFromSortedListII.deleteDuplicates(listNode);
        System.out.println(node);
    }
}
