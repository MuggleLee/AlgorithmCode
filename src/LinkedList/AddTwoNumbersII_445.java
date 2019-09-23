package LinkedList;

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

    private ListNode result = listNode;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = 0;
        int len2 = 0;
        ListNode node = new ListNode(0);
        while (l1 != null) {
            len1++;
            l1 = l1.next;
        }
        while (l2 != null) {
            len2++;
            l2 = l2.next;
        }
        if (len1 > len2) {
            while (l1 != null) {
                l1 超出的部分迭代
            }
        }


        return null;
    }

    public int add(ListNode node1, ListNode node2) {
        int sum = node1.val + node2.val;
        ListNode node = new ListNode(sum % 10);
        node.next = listNode;
        listNode = node;
        if (node1.next != null) {
            listNode.val += add(node1.next, node2.next);
        }
        return listNode.val / 10;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(7);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(4);
        listNode5.next = listNode6;
        listNode6.next = listNode7;

        AddTwoNumbersII_445 addTwoNumbersII = new AddTwoNumbersII_445();
        ListNode node = addTwoNumbersII.addTwoNumbers(listNode1, listNode4);
        System.out.println(node);
    }
}
