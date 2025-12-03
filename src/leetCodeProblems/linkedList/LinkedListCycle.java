package src.leetCodeProblems.linkedList;
//leetcode - 141

// Given head, the head of a linked list, determine if the linked list has a cycle in it.
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//Return true if there is a cycle in the linked list. Otherwise, return false.
public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Test case 1: List without cycle
        ListNode header1 = new ListNode(3);
        header1.next = new ListNode(2);
        header1.next.next = new ListNode(0);
        header1.next.next.next = new ListNode(-4);

        System.out.print("List 1: ");
        printList(header1);
        boolean listCycle1 = hasCycle(header1);
        System.out.println("Has cycle: " + listCycle1);
        System.out.println();

        // Test case 2: List with cycle
        ListNode header2 = new ListNode(3);
        header2.next = new ListNode(2);
        header2.next.next = new ListNode(0);
        header2.next.next.next = new ListNode(-4);
        header2.next.next.next.next = header2.next; // Create cycle: -4 points back to 2

        System.out.print("List 2: ");
        printListWithCycle(header2, 4);
        boolean listCycle2 = hasCycle(header2);
        System.out.println("Has cycle: " + listCycle2);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null && count < 10) { // Limit to prevent infinite loop
            System.out.print(current.val);
            if (current.next != null && count < 9) {
                System.out.print(" -> ");
            }
            current = current.next;
            count++;
        }
        System.out.println();
    }

    private static void printListWithCycle(ListNode head, int nodesBeforeCycle) {
        ListNode current = head;
        for (int i = 0; i < nodesBeforeCycle; i++) {
            System.out.print(current.val);
            if (i < nodesBeforeCycle - 1) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" -> (cycle back to node with value " + head.next.val + ")");
    }
}
