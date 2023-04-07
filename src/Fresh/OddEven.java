package Fresh;

import java.util.ArrayList;
import java.util.List;

public class OddEven {

	public static void main(String[] args) {
/**
		// odd even in an array
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List even = new ArrayList();
		List odd = new ArrayList();

		for (int i = 0; i <= a.length; i++) {
			if (i % 2 == 0) {
				even.add(i);
			}

			else {
				// System.out.println("oddd number : "+i);

				odd.add(i);
				// System.out.println(odd);
			}

		}
		//System.out.println(even);
		//System.out.println(odd);
**/
		// odd even in an number

		int num = 123456;
		int temp = 0;
		while (num > 0) {
			temp = num % 10;
			
			if(temp%2==0) {
				System.out.println(temp+": is even number");
			} else {
				System.out.println(temp+": is odd number");
				}
			num = num / 10;
			//System.out.print(temp);
			
		}
		System.out.println("------------");
		
		/**
		 * “This is good”. WAP in such a way that where odd places 
replace small letter and even places replace capital letter 
without ignoring spaces.
		 */
	String s="This is good";
           
	char[] ch= s.toCharArray(); 
	
	for(int i=0;i<ch.length;i=i+2) {
		
	}
	
	
	
		
		
		

	}

}
