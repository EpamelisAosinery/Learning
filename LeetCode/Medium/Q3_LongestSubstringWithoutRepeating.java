package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q3_LongestSubstringWithoutRepeating {
   public static void main(String[] args) {
      String s1 = "abcabcb";
      String s2 = "bbbbb";
      String s3 = "pwwkew";

      System.out.println(lengthOfLongestSubstring(s1));
      // System.out.println(lengthOfLongestSubstring(s2));
      // System.out.println(lengthOfLongestSubstring(s3));
              
   }

   public static int lengthOfLongestSubstring(String s) {
      // 1ms
      int n = s.length();
      int res = 0;
      int[] arr = new int[128]; 
 

      for(int start = 0, end = 0; end < n; end++) {
         char ch = s.charAt(end);
         System.out.println("char: " + ch + " index: " + arr[ch]);

         start = Math.max(start, arr[ch]);
         res = Math.max(res, end - start + 1);
         System.out.println("start: " + start + " res: " + res);
         System.out.println();
         

         arr[ch] = end + 1;
      }
      return res;
      
      // 117ms
      // int length = s.length();
      // int left = 0, maxLength = 0, start = 0;
      // Map<Character, Integer> substring = new HashMap<>(); 
       
      // for (int i = 0; i < length; i++) {
      //    if (substring.containsKey(s.charAt(i))) {
      //       System.out.println(s.charAt(i) + " - " + i); 
      //       left = Math.max(substring.get(s.charAt(i)) + 1, left);
      //    }  
      //    substring.put(s.charAt(i), i);
      //    if (i - left + 1 > maxLength) {
      //       maxLength = i - left + 1;
      //       start = left;
      //    } 
      // } 

      // return s.substring(start, start + maxLength).length();
   }
}
