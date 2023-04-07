package JavaSession;

public class ConditionalOperators {

	public static void main(String[] args) {
		// byte b=054;
		// if we wll write any number ending with 8 we will get compile time error
		// bcoz range should be 7
		// byte b1=065;
		// System.out.println(b);
		// System.out.println(b1);//46 octal number
		// 065-->5x8^0
		// 065=(0X )
		// ***************************************//

		int a = 10;
		int b = 20;
		System.out.println(a == b);// will return true/false
		// this Comparison operator == is compare between two primitive data type

		//
		if (a == b) {
			System.out.println("PASS");
			
		} else {
			System.out.println("FAIL");
		}
		// dead code warning
		if (false) {
			System.out.println("HI");
		} else {
			System.out.println("Bye");
		}
		// no deadcode warning if flag user
		boolean flag = true;

		if (flag) {
			System.out.println("selenium");
		} else {
			System.out.println("uft");
		}

		double d1 = 11.31;
		double d2 = 19.51;
		if (d1 == d2) {
			System.out.println("both are eqaul");
		} else {
			System.out.println("both r not eqaul");
		}
		// non primitive data comparison is .eqal();
		String s1 = "Hello";
		String s2 = "hello";
		if (s1.equals(s2)) {
			System.out.println("eq");
		} else {
			System.out.println("no eqaul");
		}

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("equalsIgnoreCase pass");
		} else {
			System.out.println("equalsIgnoreCase fail");
		}

		if (s1 == s2) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}
		///

		int total = 85;
		if (total <= 100) {
			if (total >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("Grade A");
			}
		}
		
		/////////////////////
		
		String browser="ff";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if(browser.equals("ff")) {
			System.out.println("launch ff");
		}
		if(browser.equals("ie")) {
			System.out.println("launch ie");
		}
		if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("please pass right browser");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
