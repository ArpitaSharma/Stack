class Stack1
{
	static final int MAX =10;
	int top;
	int a[] = new int[MAX];
	
	boolean isempty()
	{
		return(top<0);
	}
	Stack1()
	{
		top =-1;
		
	}
	
	boolean push(int x)
	{
		if(top>=MAX-1)
		{
			System.out.println("STACK FULL");
			return false;
		}
		
		else
		{
			a[++top]=x;
			return true;
		}
	}
	
	int pop()
	{
		if(top<0)
		{
			System.out.println("UNDERFLOW");
			return 0;
		}
		else{
			int x = a[top--];
			return x;
		}
		
			
	}
	
	public static void main(String[] args)
	{
		Stack1 s = new Stack1();
		System.out.println(s.push(10)+" PUSHED IN");
		System.out.println(s.push(20)+" PUSHED IN");
		System.out.println(s.push(30)+" PUSHED IN");
		System.out.println(s.push(50)+"PUSHED IN");
		
		System.out.println(s.pop()+" POPPED OUT");
		
	}
}
