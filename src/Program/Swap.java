package Program;

public class Swap {

	public static void main(String[] args) {
		
		// using 3rd vaeriable
		int c=10;
		int d=20;
		
		int t=c;  //t =10
		    c=d;
		    d=t;
		    
		   // System.out.println(c  +" "+d);
		

		int a = 10;
		int b = 20;
//		b = a + b;// 30=10+20
//		a = b - a;// 20
//		b = b - a;
		//System.out.println(a + " :" + b);

//		    a=a*b;//10*20=200
//		    b=a/b;//200/20=10;
//		    a=a/b;//200/10=20
		    
		  System.out.println(a + " :" + b);
		    //in single line:
		    b=a+b-(a=b);//execute rit to left
		    System.out.println(" valueis  : "+a + " :" + b);
		    
	}

}
