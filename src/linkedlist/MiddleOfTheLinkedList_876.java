package linkedlist;

/**
 * @author Muggle Lee
 * @Date: 2019/9/24 11:31
 * 问题描述：
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 * Example 2:
 * <p>
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class MiddleOfTheLinkedList_876 {
    public ListNode middleNode(ListNode head) {
        ListNode tem = head;
        int length = 0;
        int index = 0;
        while (tem != null) {
            length++;
            tem = tem.next;
        }
        index = length / 2;
        tem = head;
        for (int i = 0; i < index; i++) {
            tem = tem.next;
        }
        return tem;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        MiddleOfTheLinkedList_876 middleOfTheLinkedList = new MiddleOfTheLinkedList_876();
        ListNode node = middleOfTheLinkedList.middleNode(listNode1);
        System.out.println(node);
    }
}
