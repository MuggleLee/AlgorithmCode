package linkedlist;

/**
 * @author Muggle Lee
 * @Date: 2019/9/23 16:24
 * <p>
 * 问题描述：
 * You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 * <p>
 * Example:
 * <p>
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 8 -> 0 -> 7
 */
public class AddTwoNumbersII_445 {

    private ListNode listNode = new ListNode(0);
    private int sum = 0;
    private int returnNumber = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        int len1 = 0;
        int len2 = 0;
        ListNode tem = new ListNode(0);
        ListNode returnResult = tem;
        while (node1 != null) {
            len1++;
            node1 = node1.next;
        }
        while (node2 != null) {
            len2++;
            node2 = node2.next;
        }
        if (len1 != len2) {
            if (len1 > len2) {
                for (int i = 0; i < len1 - len2; i++) {
                    tem.next = l1;
                    l1 = l1.next;
                    tem = tem.next;
                }
            }
            if (len2 > len1) {
                for (int i = 0; i < len2 - len1; i++) {
                    tem.next = l2;
                    l2 = l2.next;
                    tem = tem.next;
                }
            }
            tem.next = null;
            returnNumber = add(l1, l2);
            returnNumber = add(returnResult.next, new ListNode(0));
            if (returnNumber > 0) {
                listNode.val = returnNumber;
                return listNode;
            }
            return listNode.next;
        }

        returnNumber = add(l1, l2);
        if (returnNumber > 0) {
            listNode.val = returnNumber;
            return listNode;
        }
        return listNode.next;
    }

    public int add(ListNode longNode, ListNode shortNode) {
        shortNode = shortNode == null ? new ListNode(0) : shortNode;
        if (longNode.next != null || shortNode.next != null) {
            returnNumber = add(longNode.next, shortNode.next);
        }
        sum = longNode.val + shortNode.val + returnNumber;
        ListNode node = new ListNode(sum % 10);
        node.next = listNode.next;
        listNode.next = node;
        return sum / 10;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(9);
        ListNode listNode3 = new ListNode(9);
        ListNode listNode4 = new ListNode(9);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode listNode5 = new ListNode(1);
        ListNode listNode6 = new ListNode(1);
        ListNode listNode7 = new ListNode(1);
        ListNode listNode8 = new ListNode(1);
        ListNode listNode9 = new ListNode(1);
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;

        AddTwoNumbersII_445 addTwoNumbersII = new AddTwoNumbersII_445();
        ListNode node = addTwoNumbersII.addTwoNumbers(listNode1, listNode5);
        System.out.println(node);
    }
}
