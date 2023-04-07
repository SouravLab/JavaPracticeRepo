package Program;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int org_num = num;
		int rev = 0;

		while (num != 0) {//4598
			
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		if (org_num==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

	
}
