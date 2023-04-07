package Program;

public class A {
	static String rev = "";

	public static void main(String[] args) {
		String s = "this is a java code";

		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {

			// System.out.println(s1[i]);

			for (int j = s1[i].length() - 1; j >= 0; j--) {
				rev = rev + s1[i].charAt(j);

			}
			rev = rev + " ";
		}
		System.out.println(rev + " ");

	}

	public static void isStringPalindrome(String str) {

		/*
		 * String actualString = str; String revString = reverseString(str); if
		 * (actualString.equals(revString)) { System.out.println(actualString +
		 * " is a palindrome string "); } else { System.out.println(actualString +
		 * " is not a palindrome string "); } } private static String
		 * reverseString(String str1) { String rev = ""; for (int i = str1.length() - 1;
		 * i >= 0; i--) { rev = rev + str1.charAt(i); } return rev; } public static void
		 * main(String[] args) { isStringPalindrome("madam");
		 * isStringPalindrome("madam"); }
		 */
		System.out.println("jjj");

	}

}
