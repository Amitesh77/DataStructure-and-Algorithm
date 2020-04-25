package Recursion;

public class ReverseNumber {
	
	public static  void getRev(int n)
	{
		String rev="";
		if(n<10)
		{
			System.out.println(rev+n);
			return ;
		}
		
		else
		{
			System.out.println(rev+n%10);
			getRev(n/10);
			//rev=rev*10+n%10;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	getRev(167);

	}

}
