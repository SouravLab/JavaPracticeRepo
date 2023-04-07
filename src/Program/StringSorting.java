package Program;

public class StringSorting {

	public static void main(String[] args) {

		/*
		 * String s = "souravmishra"; int len = s.length(); //char[] c =
		 * s.toCharArray();
		 * 
		 * for (int i = 0; i < c.length; i++) {
		 * 
		 * for (int j =0 ; j <= i; j++) { System.out.print(s.charAt(j)); }
		 * System.out.println(); }
		 * 
		 * }
		 */

		// sort number

		int num = 123;
		/*
		 * 1 12 123 12 1
		 */

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			 System.out.println();
			

		}
		
		for (int k = 3; k>=1 ; k--) {
			for(int l=1;l<k;l++) {
				System.out.print(l);
			}
			System.out.println();
		}

		

	}

}
