package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DupStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {1,2,3,4,1,2,3,4,5,6,7,8,5,5,5,5};
		
		int [] a=Arrays.stream(arr).distinct().toArray();
		
		for (int i : a) {
			System.out.println(i);
		}
		
		
		
		


	}

}
