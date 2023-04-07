package InterviewProgram;

public class SumOfNumber {

	public static void main(String[] args) {
		 double num = 999999999999l;
		int temp = 0;
		
		while(num>0) {
			temp=(int) (temp+ num % 10);
			num=num/10;
		}
		System.out.println(temp);
		
		if(temp >= 10 && temp<100) {
			System.out.println("it is 2 digit number");
		}else if (temp <10){
			System.out.println("num is 1 digit");
		}

	}

}
