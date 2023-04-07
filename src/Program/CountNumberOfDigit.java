package Program;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		
		int num=100001;
		int count = 0;
		
		while(num>0) {
			num=num/10;
			count++;
			
		}System.out.println("total digit of the number is : "+ count);
		
		
				
		
	}

}
