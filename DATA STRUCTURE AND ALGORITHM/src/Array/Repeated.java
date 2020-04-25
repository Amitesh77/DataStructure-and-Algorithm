package Array;

public class Repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,2,2,3,4,4,5,5};
		
		
			for (int i = 0; i < arr.length-1; i++) {
				
				
				if(arr[i]==arr[i+1])
				{
					i+=2;
				}
				
				else
				{
					System.out.println(arr[i]);
				}
				
			}

	}

}
