package Program;

public class CountSumOfDigitInANumber {

	public static void main(String[] args) {
		int num = 1234;
		int temp = 0, sum = 0;
		while (num > 0) {

//			temp = num % 10;
//			sum = sum + temp;
			
			sum=sum+num%10;//7
			num = num / 10;//123
		}

		System.out.println(sum);
	}

}
