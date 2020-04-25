package Recursion;

public class Fibonaci {
	
	static String s="";
	 static int s1=0;
	public static int getFibo(int n)
	{
		
		
		if(n<1)
		{
			System.out.println("invalid input");
		}
		
		else if(n==1 || n==2)
		{
			s1=n-1;
		}
		
		else
		{
			s1=getFibo(n-1)+getFibo(n-2);
		}
		
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(getFibo(5));
	}

}
