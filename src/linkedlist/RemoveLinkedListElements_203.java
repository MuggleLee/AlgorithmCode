package linkedlist;

/**
 * @author Muggle Lee
 * @Date: 2019/9/24 15:48
 */
public class RemoveLinkedListElements_203 {
    /**
     * 通过迭代的方式
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode tem = head;
        ListNode node = new ListNode(0);
        ListNode result = node;
        ListNode nextNode = null;
        while (tem != null) {
            if (tem.val == val) {
                tem = tem.next;
                continue;
            }
            nextNode = tem.next;
            tem.next = null;
            node.next = tem;
            node = node.next;
            tem = nextNode;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        RemoveLinkedListElements_203 removeLinkedListElements = new RemoveLinkedListElements_203();
        ListNode node = removeLinkedListElements.removeElements(listNode1, 4);
        System.out.println(node);
    }
}
