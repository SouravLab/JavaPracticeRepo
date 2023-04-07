package Fresh;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=123;
		int rem=0;
		while(num>0) {

            rem=num%10;
			num=num/10;
			//System.out.print(rem);
		}
		int n=346;
		int rev=0;
		while(n!=0) {
			rev = rev * 10 + n % 10;
			n=n/10;
		}
		System.out.println(rev);
	}

}
