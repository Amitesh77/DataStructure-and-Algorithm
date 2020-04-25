package Recursion;

public class Factorial {
	
	static int fib=1;
	public static int Fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		else
		{
			Fact(n-1);
			
			
		}
		fib=fib*n;
		return fib;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Fact(7));

	}

}
