package Hard;

import java.util.Arrays;

public class Q4_MedianOfTwoSortedArrays {
   public static void main(String[] args) {
      int[] num1_1 = {1, 3};
      int[] num1_2 = {2};
      int[] num2_1 = {1, 3};
      int[] num2_2 = {2, 4};

      System.out.println(findMedianSortedArrays(num1_1, num1_2));
      System.out.println(findMedianSortedArrays(num2_1, num2_2));
   }

   public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      // 5ms
      int l1 = nums1.length;
      int l2 = nums2.length;

      int[] arr = new int[l1 + l2];

      System.arraycopy(nums1, 0, arr, 0, l1);
      System.arraycopy(nums2, 0, arr, l1, l2);
      
      Arrays.sort(arr);

      if ((l1 + l2) % 2 == 0) {
         int findMiddle = (l1 + l2) / 2;
         return (double)(arr[findMiddle - 1] + arr[findMiddle]) / 2;
      }
      else {
         int findMiddle = (l1 + l2) / 2;
         return (arr[findMiddle]); 
      }

      // 1ms
      /*
          if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
         }

         int x = nums1.length;
         int y = nums2.length;
         int low = 0, high = x;

         while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];
            
            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxX <= minY && maxY <= minX) {
               if ((x + y) % 2 == 0) {
                  return ((double)Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
               } else {
                  return (double)Math.max(maxX, maxY);
               }
            } else if (maxX > minY) {
                  high = partitionX - 1;
            } else {
               low = partitionX + 1;
            }
         }

         throw new IllegalArgumentException("Input arrays are not sorted.");
      }
      */
   }
}
