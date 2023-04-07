package Fresh;

public class Fibonacci {
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 
	//0+0=0,
	public static void main(String[] args) {
    
		// wap to print fibonacci of  1 to 10
		
		int n1=0,n2=1, sum = 0;
		
		for(int i=2;i<=10;i++) {
		
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
			
		}
		

	}

}
