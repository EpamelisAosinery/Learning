package Medium;

import java.util.Stack;

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

public class Q2_AddTwoNumbers {
   public static void main(String[] args) {
      ListNode l1_1 = createLinkedList(new int[] { 2, 4, 3 });
      ListNode l1_2 = createLinkedList(new int[] { 5, 6, 4 });

      System.out.println("Pair 1:");
      printLinkedList(addTwoNumber(l1_1, l1_2));
      printLinkedListInReverse(addTwoNumber(l1_1, l1_2));
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

   // Helper method to print a linked list
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

   // Helper method to print a linked list in reverse order using a stack
   public static void printLinkedListInReverse(ListNode head) {
      Stack<Integer> stack = new Stack<>();
      ListNode current = head;

      // Push all values onto the stack
      while (current != null) {
         stack.push(current.val);
         current = current.next;
      }

      // Pop values to print in reverse order
      while (!stack.isEmpty()) {
         System.out.print(stack.pop());
         if (!stack.isEmpty()) {
            System.out.print(" -> ");
         }
      }
      System.out.println();
   }

   public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
      ListNode dummyHead = new ListNode(0);
      ListNode current = dummyHead;
      int carry = 0;

      while (l1 != null || l2 != null || carry != 0) {
         int x = (l1 != null) ? l1.val : 0;
         int y = (l2 != null) ? l2.val : 0;
         
         int sum = carry + x + y;
         carry = sum / 10;

         current.next = new ListNode(sum % 10);
         current = current.next;

         if (l1 != null) l1 = l1.next; 
         if (l2 != null) l2 = l2.next; 
      }
      return dummyHead.next;
   }
}
