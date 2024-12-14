package Easy;

public class Q1768_MergeStringsAlternately {
   public static void main(String[] args) {
      String word1_1 = "abc";
      String word1_2 = "pqr";
      String word2_1 = "ab";
      String word2_2 = "pqrs";
      String word3_1 = "abcd";
      String word3_2 = "pq";

      System.out.println(mergeAlternately(word1_1, word1_2)); 
      System.out.println(mergeAlternately(word2_1, word2_2)); 
      System.out.println(mergeAlternately(word3_1, word3_2)); 
   }

   // 4ms
   public static String mergeAlternately(String word1, String word2) {
      StringBuilder mergeString = new StringBuilder();
      int totalLength = word1.length() + word2.length();
      int x = 0;
      while (x < totalLength) {
         if (x < word1.length()) {
            mergeString.append(word1.charAt(x));  
         }
         if (x < word2.length()) {
            mergeString.append(word2.charAt(x));  
         } 
         x++;
      } 

      return mergeString.toString();
   }
}
