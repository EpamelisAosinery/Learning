package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Q1_TwoSum {
   public static void main(String[] args) {
      int[] input1 = {2,7,11,15};
      int[] input2 = {3,2,4};
      int[] input3 = {3,3};

      int target1 = 9;
      int target2 = 6;
 
      // System.out.println(Arrays.toString(twoSum(input1, target1)));
      // System.out.println(Arrays.toString(twoSum(input2, target2)));
      // System.out.println(Arrays.toString(twoSum(input3, target2)));

      System.out.println("\n"+Arrays.toString(twoSumHashMap(input1, target1)));
   }

   // 45ms
   public static int[] twoSum(int[] nums, int target) {
      for (int i = 0; i < nums.length; i++) {
         for (int j = i + 1; j < nums.length; j++) { 
            if (target == nums[i] + nums[j]) {
               return new int[] {i,j};
            }
         }
      }
      return new int[] {};
   }

   // 2ms
   public static int[] twoSumHashMap (int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<>(); 
      for (int i = 0; i < nums.length; i++) {
         int complement = target - nums[i];
         if (map.containsKey(complement)) { 
            return new int[] {map.get(complement), i};
         }
         map.put(nums[i], i);
      }

      return new int[] {};
   }

}
