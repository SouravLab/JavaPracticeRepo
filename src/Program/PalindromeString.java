package Program;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");
		String str = sc.next();

		String  org_Str = str;
		// rev

		int len = str.length();
		System.out.println(len);
		String rev = "";//madam

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if (rev.equals(org_Str)) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("string is not palindrome");
		}
	}
}
