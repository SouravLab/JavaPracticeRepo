package Program;


public class OddEven {

	public static void main(String[] args) {

		int a=0,b=1,c,n=1;
		System.out.print(a+ "" +b);

		for (int i = 1; i <=15; i++) {
			c=a+b;
			System.out.print(c+"  ");
			a=b;
			b=c;
		}



		/*
		 * while(n<=5) {
		 * 
		 * c=a+b; System.out.print(c+" "); a=b; b=c; n++;
		 * 
		 * }
		 */
	}

}


