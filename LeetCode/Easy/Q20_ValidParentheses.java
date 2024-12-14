package Easy;

import java.util.Stack;

public class Q20_ValidParentheses {
   public static void main(String[] args) {
      String s1 = "()";       // true
      String s2 = "()[]{}";   // true
      String s3 = "(]";       // false
      String s4 = "([])";     // true
      String s5 = "([)]";     // false

      System.out.println(isValid(s1));
      System.out.println(isValid(s2));
      System.out.println(isValid(s3));
      System.out.println(isValid(s4));
      System.out.println(isValid(s5));
   }

   // 2ms - 1ms
   public static boolean isValid(String s) {
      // Stack<Character> cStack = new Stack<>();

      // for (char c : s.toCharArray()) {
      //    if (c == '(' || c == '{' || c == '[') {
      //       cStack.push(c);
      //    } 
      //    else {
      //       if (cStack.isEmpty())  return false;
      //       char popTop = cStack.pop();
      //       if (c == ')' && popTop != '(' ||
      //          c == ']' && popTop != '[' ||
      //          c == '}' && popTop != '{'
      //       ) return false; 
      //    }
      // }
      // return cStack.isEmpty();

      char[] cArray = new char[s.length()];
      int top = -1;

      for (char c : s.toCharArray()) {
         if (c == '(' || c == '{' || c == '[') 
            cArray[++top] = c;
         else {
            if (top == -1) return false;
            char popTop = cArray[top--];
            if (c == ')' && popTop != '(' ||
               c == ']' && popTop != '[' ||
               c == '}' && popTop != '{'
            ) return false;
         }
      }
      return top == -1;
   }
}
