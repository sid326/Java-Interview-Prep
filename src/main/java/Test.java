import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack();
		
		String testStr = "{{[]]}}";
		
		char[] ch = testStr.toCharArray();
		boolean isValid = true;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='{' || ch[i] == '(' || ch[i]=='[')
				stack.push(ch[i]);
			else
			{
				if(ch[i]=='}' && stack.peek()=='{')
					stack.pop();
				else if(ch[i]==')' && stack.peek()=='(')
					stack.pop();
				else if(ch[i]==']' && stack.peek()=='[')
					stack.pop();
				
				else {
					System.out.println("String is not valid");
					isValid = false;
					break;
				}
			}
		}
		
		if(isValid)
			System.out.println("String is valid");
	}
}
