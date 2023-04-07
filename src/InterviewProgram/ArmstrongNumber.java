package InterviewProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	// 153
	//	1*1*1+5*5*5+3*3*3

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();

		// int num = 153;
		int orginalNumber = num, reminder;
		int temp = 0;

		while (num != 0) {

			reminder = num % 10;
			temp = temp + (reminder * reminder * reminder);
			num = num / 10;

		}
		System.out.println(temp);
		if (temp == orginalNumber) {
			System.out.println("it is an armstrong number");
		} else
			System.out.println("it is not an armstrong number");
	}

}
