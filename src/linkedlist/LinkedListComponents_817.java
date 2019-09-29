package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Muggle Lee
 * @Date: 2019/9/27 10:43
 * 问题描述：
 * We are given head, the head node of a linked list containing unique integer values.
 * <p>
 * We are also given the list G, a subset of the values in the linked list.
 * <p>
 * Return the number of connected components in G, where two values are connected if they appear consecutively in the linked list.
 */
public class LinkedListComponents_817 {
    /**
     * 通过set集合判断子集有多少个“组件”。ps.组件是连续的
     * @param head
     * @param G
     * @return
     */
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet();
        for (int i : G) {
            set.add(i);
        }
        int num = 0;
        while (head != null) {
            if (set.contains(head.val) && (head.next == null || !set.contains(head.next.val))) {
                num++;
            }
            head = head.next;
        }
        return num;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        int[] list = new int[]{0, 1, 2, 4};
        LinkedListComponents_817 linkedListComponents = new LinkedListComponents_817();
        int num = linkedListComponents.numComponents(listNode, list);
        System.out.println(num);
    }
}
