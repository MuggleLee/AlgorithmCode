package linkedlist;

/**
 * @author Muggle Lee
 * @Date: 2019/9/24 11:51
 */
public class DeleteNodeInALinkedList_237 {

    private static ListNode head = new ListNode(1);

    public void deleteNode(ListNode node) {
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        head.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        DeleteNodeInALinkedList_237 deleteNodeInALinkedList = new DeleteNodeInALinkedList_237();
        deleteNodeInALinkedList.deleteNode(listNode3);
        System.out.println(head);
    }
}
