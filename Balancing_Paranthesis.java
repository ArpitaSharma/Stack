import java.util.Stack;
class Balancing_Paranthesis
{
	int top =-1;
	char item[] = new char[100];
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	char pop()
	{
		char element = item[top];;
		if(top==-1)
			System.out.println("UNDERFLOW");
		else
			top--;
			return element;
			
	}
	
	void push(char x)
	{
		if(top==99)
			System.out.println("OVERFLOW");
		else
			item[++top]=x;
	}
	
	static boolean isMatching(char c1,char c2)
	{
		if(c1=='{' && c2=='}')
			return true;
		if(c1=='(' && c2 == ')')
			return true;
		if(c1=='[' && c2==']')
			return true;
		else
			return false;
	}
	
	static boolean isBalanced(char exp[])
	{
		Stack st = new Stack();
		
		for(int i=0;i<exp.length;i++)
		{
			if(exp[i]=='[' || exp[i]=='(' || exp[i]=='{')
				st.push(exp[i]);
			if(exp[i]=='}' || exp[i]==')' || exp[i]==']')
			{
				if(st.isEmpty())
					return false;
				else if(!isMatching(st.pop(),exp[i]))
					return false;
			}
		}
		if(st.isEmpty())
			return false;
		else 
			return true;
				
	}
	
	public static void main(String[] args)
	{
		char exp[] = {'{','(',')','}','[',']'};
		if(isBalanced(exp))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}
			
