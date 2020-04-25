package Array;

public class Test {
	
	public static void Delete(int[] arr,int n)
	{
		if(arr[n]!=0)
		{
			arr[n]=Integer.MIN_VALUE;
		}
		
		else
		{
			System.out.println("location is blank");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubint[
		
		
		int []arr= new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		Delete(arr,3);
		
		for (int i : arr) {
			
			System.out.println(i);
		}
		
		System.out.println(arr.length);
		
		
		
	}

}
