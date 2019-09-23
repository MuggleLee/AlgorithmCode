package LinkedList;

/**
 * @author Muggle Lee
 * @Date: 2019/9/20 13:15
 * 问题描述：
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * To represent a cycle in the given linked list,
 * we use an integer pos which represents the position (0-indexed) in the linked list
 * where tail connects to.
 * If pos is -1, then there is no cycle in the linked list.
 */
public class LinkedListCycle_141 {
//    public boolean hasCycle(ListNode head) {
//        long startTime = System.currentTimeMillis();
//        long elapsedTime = 0L;
//        // 1. 暴力解法：规定时间内直接循环到底查看是否有循环。
//        // 但这种解法很明显有问题，循环超出规定时间，就直接返回true，其实也有可能因为链表很长，还没有循环到链表的尽头
//        while (head != null) {
//            if(elapsedTime > 1 * 1000){
//                return true;
//            }
//            head = head.next;
//            elapsedTime = System.currentTimeMillis() - startTime;
//        }
//        return false;
//    }

//    /**
//     * 2.利用set特性。将节点存进set集合，如果发现有一样的就判断为环形链表
//     * @param head
//     * @return
//     */
//    public boolean hasCycle(ListNode head) {
//        Set set = new HashSet();
//        while (head != null) {
//            ListNode tem = head;
//            if(set.contains(tem)){
//                return true;
//            }
//            set.add(tem);
//            head = head.next;
//        }
//        return false;
//    }

    /**
     * 3.使用快慢指针。如果快指针和慢指针相遇就证明是环形链表。（类似龟兔赛跑，如果跑到是环形的话乌龟和兔子一定会相遇）
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
