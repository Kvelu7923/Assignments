package week1.day4;

public class PrintDuplicate {
	public static void main(String[] args) {
		int[] num= {44,22,31,22,55,44,12,77,12,88,77,71,99,11};
		for (int i = 0; i < num.length; i++) {
		for (int j = i+1; j < num.length; j++) {
			if(num[i]==num[j]) {
			System.out.println(num[i]);
		}	
		}
	}

	}
	}