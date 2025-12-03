package src.leetCodeProblems.linkedList;
//Leetcode - 21

//You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//Return the head of the merged linked list.
public class MergeLinkedList {
    // Definition for singly-linked list
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

     public static ListNode mergeList(ListNode list1, ListNode list2){
         ListNode dummy = new ListNode(-1); // a sentinel stone guiding the flow
         ListNode current = dummy;

         while (list1 != null && list2 != null) {
             if (list1.val < list2.val) {
                 current.next = list1;
                 list1 = list1.next;
             } else {
                 current.next = list2;
                 list2 = list2.next;
             }
             current = current.next;
         }

         // Attach the remaining nodes
         current.next = (list1 != null) ? list1 : list2;

         return dummy.next;
     }

    public static void main(String[] args) {
        // Create first sorted linked list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create second sorted linked list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.print("List 1: ");
        printList(list1);
        
        System.out.print("List 2: ");
        printList(list2);

        ListNode merged = mergeList(list1, list2);

        System.out.print("Merged list: ");
        printList(merged);
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
}
