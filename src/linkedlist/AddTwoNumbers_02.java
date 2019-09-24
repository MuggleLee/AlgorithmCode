package linkedlist;

/**
 * @author Muggle Lee
 * @Date: 2019/9/20 17:40
 * <p>
 * 问题描述：
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers_02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode node = result;
        int sum = 0;
        while (l1 != null || l2 != null || sum > 0) {
            if (l1 != null) {
                sum = l1.val + sum;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = l2.val + sum;
                l2 = l2.next;
            }
            result.next = new ListNode(sum % 10);
            sum = sum / 10;
            result = result.next;
        }

        return node.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(9);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(9);
        ListNode listNode5 = new ListNode(1);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        AddTwoNumbers_02 addTwoNumbers = new AddTwoNumbers_02();
        ListNode node = addTwoNumbers.addTwoNumbers(listNode1, listNode4);
        System.out.println(node);
    }
}
