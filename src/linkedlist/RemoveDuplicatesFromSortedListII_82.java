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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode node = head;
//        node.next = head;
        ListNode result = node;
        ListNode nextNode = null;
        int flag = head.val;
        while (node != null) {
            nextNode = node.next;
            if (flag == nextNode.val) {
                flag = node.val;
            }
            flag = node.val;
            node = nextNode;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(3 % 7);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        RemoveDuplicatesFromSortedListII_82 removeDuplicatesFromSortedListII = new RemoveDuplicatesFromSortedListII_82();
        ListNode node = removeDuplicatesFromSortedListII.deleteDuplicates(listNode1);
        System.out.println(node);
    }
}
