package JavaSession;

public class StringConcatenation {
// String is a non-primitive data type
	public static void main(String[] args) {
		String x = "Hello";
		String y = "World";
		System.out.println(x + y);// HelloWorld

		int a = 100;
		int b = 200;
		double d1 = 12.33;
		double d2 = 19.33 + 65.33;

		System.out.println(a + b);// 300
		System.out.println(a + b + x + y);// 300HelloWorld
		System.out.println(x + y + a + b);// HelloWorld100200
		System.out.println(x + y + (a + b));// HelloWorld300
		System.out.println(d1 + d2);// 96.99
		System.out.println(b - a);// 100
		System.out.println(b / a);// 2
		System.out.println(a * b);// 2000

		System.out.println(x + y + d1 + d2 + a + b);// HelloWorld12.3384.66100200
		// "-" will not allow near string>x-y..-ve operator not allowed
		System.out.println(x + y + (d1 - d2 + a + b));

		int h = 10;
		int p = 2;
		System.out.println(h / p);// 5
		System.out.println(9 / 3);// 3
		System.out.println(9.0 / 3);// 3.0 if any one no is floating number then always give in case any 1st
									// floating value>3.0
		System.out.println(9.0 / 3.0); // 3.0//both are floating hence floating number op>3.0
		System.out.println(9/ 3.0);// 3.0
		// System.out.println(9/0);//ArithmeticException:

		System.out.println(9.0 / 0);// Infinity>any floating divided by zero infinity
		System.out.println(8.33 / 0);// Infinity
		System.out.println(9 / 0.0);// Infinity
		System.out.println(9.0 / 0.0);// Infinity
		// System.out.println(0/0);//ArithmeticException
		System.out.println(0.0 / 0.0);// NaN--not a number

		System.out.println(0 / 9);// 0
		System.out.println(0.0 / 9);// 0.0
		System.out.println(0 / 12.33);// 0.0
		System.out.println("----------");
		System.out.println("----------");

		System.out.println(8 % 2);// 0
		System.out.println(9 % 2);// 1
		System.out.println(901 % 2);// 1
		System.out.println(9.2 % 2);// 1.19999999999
		
		System.out.println(0.1 + 0.3);// 0.4
		System.out.println(0.2 + 0.3);// 0.5
		System.out.println(0.1 + 0.4);// 0.5
		System.out.println(0.1 + 0.2);// 0.3000000000004//precession decimal problem

	}

}
