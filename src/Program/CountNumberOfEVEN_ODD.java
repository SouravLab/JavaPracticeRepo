package Program;

public class CountNumberOfEVEN_ODD {

	public static void main(String[] args) {
		
		int num=123456789;
		
		int odd_count =0;
		int even_Count =0;
		int rem;
		
		while(num>0) {
			
			 rem=num%2;
			 
			 if(rem%2==0) {
				 even_Count++;
			 }else {
				 odd_count++;
			 }
				 num=num/10;
			
		}
		
		System.out.println("oddd count is  : "+odd_count+" and even count is : "+even_Count);
		
		
		
		
	}

}
