package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Muggle Lee
 * @Date: 2019/9/24 13:43
 */
public class IntersectionOfTwoLinkedLists_160 {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode nodeA = headA;
//        ListNode nodeB = headB;
//        Set set = new HashSet();
//        while (nodeA != null) {
//            set.add(nodeA);
//            nodeA = nodeA.next;
//        }
//        while (nodeB != null) {
//            if(set.contains(nodeB)){
//                return nodeB;
//            }
//            nodeB = nodeB.next;
//        }
//        return null;
//    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != nodeB) {
            nodeA = nodeA == null ? headB : nodeA.next;
            nodeB = nodeB == null ? headA : nodeB.next;
        }
        return nodeA;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode listNode5 = new ListNode(5);
        listNode5.next = listNode3;

        IntersectionOfTwoLinkedLists_160 intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists_160();
        ListNode node = intersectionOfTwoLinkedLists.getIntersectionNode(listNode1, listNode5);
        System.out.println(node);
    }
}
