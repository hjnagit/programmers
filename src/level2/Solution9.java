package level2;

import java.util.Stack;

public class Solution9 {

	public static void main(String[] args) {
		String str = "3r3sdgdy4ytesgseg"; 
		solution(str);
	}
	
	//짝지어 제어하기          
	static int solution(String s)
    {
		Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) 
          if(!stack.isEmpty() && stack.peek() == c) stack.pop();
          else stack.push(c);
         
        return stack.isEmpty() ? 1 : 0;
    }

}
