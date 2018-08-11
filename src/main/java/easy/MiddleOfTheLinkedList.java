package easy;

import model.ListNode;

public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode initialListNode = head;
        ListNode listNode;
        int length = 0;

        while ((listNode = head) != null) {
            head = head.next;
            length++;
        }

        int middle = length / 2;

        for (int i = 0; i <= middle; i++) {
            listNode = initialListNode;
            initialListNode = initialListNode.next;
        }

        return listNode;
    }

    //best solution
//    public ListNode middleNode(ListNode head) {
//        ListNode slow = head, fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
}
