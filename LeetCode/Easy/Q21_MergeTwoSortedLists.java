package Easy;

class ListNode {
   int val;
   ListNode next;

   ListNode() { }

   ListNode(int val) {
      this.val = val;
   }

   ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
   }
}

public class Q21_MergeTwoSortedLists {
   public static void main(String[] args) {
      ListNode l1_1 = createLinkedList(new int[] { 1, 2, 4 });
      ListNode l1_2 = createLinkedList(new int[] { 1, 3, 4 });
      ListNode l2_1 = createLinkedList(new int[] { });
      ListNode l2_2 = createLinkedList(new int[] { });
      ListNode l3_1 = createLinkedList(new int[] { });
      ListNode l3_2 = createLinkedList(new int[] { 0 });

      printLinkedList(mergeTwoLists(l1_1, l1_2));
      printLinkedList(mergeTwoLists(l2_1, l2_2));
      printLinkedList(mergeTwoLists(l3_1, l3_2));
   }

   // 0ms
   public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode dummyHead = new ListNode();
      ListNode current = dummyHead; 
      while (list1 != null && list2 != null) { 
         if (list1.val <= list2.val) { 
            current.next = list1;
            list1 = list1.next;
         } else { 
            current.next = list2;
            list2 = list2.next;
         }
         current = current.next;
      }
 
      if (list1 != null) { 
         current.next = list1;
      } else { 
         current.next = list2;
      }

      return dummyHead.next;
   }

   public static ListNode createLinkedList(                                                                                                                                                                                                 int[] values) {
      ListNode dummyHead = new ListNode(0); // Temporary dummy node
      ListNode current = dummyHead;
      for (int value : values) {
         current.next = new ListNode(value);
         current = current.next;
      }
      return dummyHead.next; // Return the actual head
   }

   public static void printLinkedList(ListNode head) {
      ListNode current = head;
      while (current != null) {
         System.out.print(current.val);
         if (current.next != null) {
            System.out.print(" -> ");
         }
         current = current.next;
      }
      System.out.println();
   }
}
