package week1.day4;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
	
	int[] num = {1,2,3,4,7,6,8};
	int sum=num.length;
	int c;
	
      Arrays.sort(num);
			for (int i = 0; i < num.length; i++) {
			c=i+1;
			if  (c!=num[i]) {
				System.out.println(c);
				break;
			}

			

				// check if the iterator variable is not equal to the array values respectively
				
					// print the number
					
					// once printed break the iteration
					
					
		}
		
	}
	

}
