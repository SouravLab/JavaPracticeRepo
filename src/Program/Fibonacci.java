package Program;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		// 0 1  1 2 3 4 5
		
		// 1 2 3 5 9 14
		
		Scanner sc = new Scanner(System.in);
		int scn=sc.nextInt();
		System.out.println(scn);
		
		
		int n1=0,n2=1, sum = 0;
		
		System.out.println(n1+"  "+n2);
		
		
		for (int i=2;i<10;i++) {
			
			sum=n1+n2;//1 
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;
			
			
		}
		
		
	}

}
