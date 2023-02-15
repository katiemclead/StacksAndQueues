import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
 /*   String myWord = "hello";
    System.out.println("Let's make a stack of letters from the word " + myWord + "!");      
    Stack<String> stack = new Stack<String>();
    for(int i = 0; i < myWord.length(); i++)
      {
        System.out.println(stack.push(myWord.substring(i, i+1)));
        
      }
    System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    stack.push("o");
            System.out.println(stack.peek());


String reverseWord = "";
    while(!stack.isEmpty())
      {
        reverseWord += stack.pop();
      }
    System.out.println(reverseWord);
    
*/
     String expression1 = "(x + 2(3 - x) + 4[5 + {2 - y}])";
       String expression2 = "(x + 2(3 - x)) + 4[5 + {2 - y}])";
       System.out.println(isCorrect(expression1));//should print true
       System.out.println(isCorrect(expression2));//should print false


    }
    
    public static boolean isCorrect(String ex)
    {
        return false;
    }
  }
