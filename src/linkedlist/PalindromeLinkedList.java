package linkedlist;


/**
 * Given a singly linked list, determine if it is a palindrome.
 * <p>
 * Example 1:
 * Input: 1->2
 * Output: false
 * <p>
 * Example 2:
 * Input: 1->2->2->1
 * Output: true
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        return false;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        RemoveDuplicatesFromSortedList_83 removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList_83();
        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(listNode1);
        System.out.println(result);
    }
}
