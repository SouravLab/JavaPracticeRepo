package Program;

import java.util.Arrays;

public class CheckArrayEqaul {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 8 };
		int[] b = { 1, 2, 3, 4, 5, 6, 8,6};
		/*
		 * boolean status = Arrays.equals(a, b);
		 * 
		 * if (status == true) { System.out.println("both array are same"); } else {
		 * System.out.println("both array are not same"); }
		 */
		boolean status = true;
		
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {/// make sure put here not eqaul
					status = false;
				}
			}

		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("both array are same");
		} else {
			System.out.println("both array not are same");
		}

	}

}
