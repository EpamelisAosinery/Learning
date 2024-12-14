package Easy;

public class Q9_PalindromeNumber {
   public static void main(String[] args) {
      System.out.println(isPalindrome(121));;
      System.out.println(isPalindrome(321));;
      System.out.println(isPalindrome(-123));;
   }

   public static boolean isPalindrome(int x) {
      // 7ms
      // String num = Integer.toString(x);
      // StringBuilder builder = new StringBuilder();
      // builder.append(num);
      // builder.reverse(); 
      // System.out.println(num);
      // System.out.println(builder);
      // return builder.toString().equals(num);

      // 5ms
      // String num = Integer.toString(x);
      // int length = num.length();
      
      // for (int i = 0; i < length / 2; i++) {
      //    if (num.charAt(i) != num.charAt(length - 1 - i)) {
      //          return false;
      //    }
      // }
      // return true;

      // 4ms
      // Negative numbers are not palindromes
      if (x < 0) return false;      
   
      int original = x, reversed = 0;

      while (x != 0) { 
         reversed = reversed * 10 + x % 10;
         x /= 10;
      }
      return original == reversed;

      // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
      // if (x < 0 || (x % 10 == 0 && x != 0))  return false;
       
   }
}
