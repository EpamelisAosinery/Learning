package Easy;

import java.util.Arrays;

public class Q13_RomanToInteger {
   public static void main(String[] args) {
      System.out.println(romanToInt("III"));
      System.out.println(romanToInt("LVIII"));
      System.out.println(romanToInt("MCMXCIV"));
   }
   
   // 2ms
   public static int romanToInt(String s) {
      int total = 0; 
      int length = s.length();

      for (int i = 0; i < length; i++) {
         char current = s.charAt(i);
         char next = (i + 1 < length) ? s.charAt(i + 1) : ' ';
         
         if (current == 'I' && (next == 'V' || next == 'X')) 
            total -= 1;
         else if (current == 'X' && (next == 'L' || next == 'C')) 
            total -= 10;
         else if (current == 'C' && (next == 'D' || next == 'M')) 
            total -= 100;
         else {
            if (current == 'I') total += 1;
            if (current == 'V') total += 5;
            if (current == 'X') total += 10;
            if (current == 'L') total += 50;
            if (current == 'C') total += 100;
            if (current == 'D') total += 500;
            if (current == 'M') total += 1000;
         }
      }
      return total;
   }
   
}
