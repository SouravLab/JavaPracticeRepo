package Program;

public class SumOfArray {

	public static void main(String[] args) {
// using normal for loop 
//Approach-1
		int[] a = { 1, 2, 3,4};
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];// 0
		}
		System.out.println(sum);
		// System.out.println(a[3]);//Index 3 out of bounds for length 2

		// Approach-2
		// using Enhance for loop

		int sum1 = 0;
		for(int b:a) {
			sum1=sum1+b;
		}System.out.println(sum1);
		
		
		
		
	}

}
