package linkedlist;

/**
 * @author Muggle Lee
 * @Date: 2019/9/20 14:59
 */
public class Main {
    // 测试
    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
//        ListNode listNode4 = new ListNode(5);
//        ListNode listNode5 = new ListNode(9);
//        ListNode listNode6 = new ListNode(9);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;

        RemoveDuplicatesFromSortedList_83 removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList_83();
        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(listNode1);
        System.out.println(result);
    }
}
