import java.util.Stack;
class Infix_Postfix
{
	static int Prec(char ch)
	{
		switch(ch)
		{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case'^':
				return 3;
		}
		return -1;
	}
	
	static String InfixToPostfix(String exp)
	{
		String result = new String("");
		Stack<Character> stack = new Stack<>();
		
		for(i=0;i<exp.length;i++)
		{
			char c = exp.charAt(i);
			
			if(Character.isLetterOrDigit(i))
				result+=c;
			else if(c=='(')
				stack.push(c);
			else if(c==')')
			{
				while(!stack.isEmpty() && stack.peek!='(')
					result +=stack.pop();
				
				if(stack.isEmpty() && stack.peek !='(')
					return ("invalid");
				else
					stack.pop();
			}
			
			else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                    result += stack.pop();
                stack.push(c);
            }
      
        }
      
        // pop all the operators from the stack
        while (!stack.isEmpty())
            result += stack.pop();
      
        return result;
    }
   
    // Driver method 
    public static void main(String[] args) 
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}
				
			}
			
			
		}
	}		
		
	}

}