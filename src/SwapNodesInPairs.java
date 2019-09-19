/**
 * @author Muggle Lee
 * @Date: 2019/9/19 15:07
 * 问题描述：
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 * Example:
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode tem = new ListNode(0);
        tem.next = head;
        ListNode result = tem;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = nextNode.next;
            nextNode.next = head;
            tem.next = nextNode;
            head = head.next;
            tem = tem.next.next;
        }
        return result.next;
    }

//    public ListNode swapPairs(ListNode head) {
//        ListNode result = new ListNode(0);
//        result.next = head;
//        ListNode dummy = result;
//        while(head != null && head.next != null) {
//            ListNode temp = head.next;
//            result.next = temp;
//            head.next = temp.next;
//            temp.next = head;
//
//            head = head.next;
//            result = result.next.next;
//        }
//        return dummy.next;
//    }

//    public ListNode swapPairs(ListNode head) {
//
//        ListNode tem = new ListNode(0);
//        tem.next = head;
//        ListNode result = tem;
//
//        while (head != null) {
//            ListNode nextNode = head.next;
//            tem.next = nextNode;
//            head.next = nextNode.next;
//            nextNode.next = head;
//            head = head.next;
//            tem = tem.next.next;
//        }
//
//        return result.next;
//    }

    // 测试
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        ListNode node = swapNodesInPairs.swapPairs(listNode);
        System.out.println(node);
    }
}