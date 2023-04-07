package Fresh;

public class ArmstrongNumber {
	/*
	 * 153 = (1*1*1)+(5*5*5)+(3*3*3) where: (1*1*1)=1 (5*5*5)=125 (3*3*3)=27 So:
	 * 1+125+27=153
	 * 
	 */
	public static void main(String[] args) {
		int num = 371;
		int original = num;
		int rev = 0;
		int temp = 0;
		while (num != 0) {
			rev = num % 10;
			temp = temp + (rev * rev * rev);
			num = num / 10;
		}
		System.out.println(temp);
		if (original == temp) {
			System.out.println("arm");
		} else {
			System.out.println("not arm");
		}
	}

}
