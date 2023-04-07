package JavaSession;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		// Arrays:
		// Arrays are always non primitive data type bcoz we are using new keyword for representing object.
		// used to store multiple similar type of data/values
		// size is fixed >limitation
		// static array-seat in flight
		// to overcome we use dynamic array
		// default value is zero in array not null

		// 1. int Array:
		int a[] = new int[4];
		// lowest index=0
		// len=4
		// hi=len-1->3
		// len=hi+1>4

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		// a[4]=50;//error in this line ArrayIndexOutOfBoundsException

		System.out.println(a[0]);// 10
		System.out.println(a[1]);// 20
		System.out.println(a[2]);// 30
		System.out.println(a[3]);// 40
		
		// System.out.println(a[4]);//ArrayIndexOutOfBoundsException
	// System.out.println(a[-1]);//ArrayIndexOutOfBoundsException
		
		System.out.println("-------");
		System.out.println(a[0] + a[2]);

		int len = a.length;
		// index based loop
		// to print all the values of array for loop:
		for (int i = 0; i <= len - 1; i++) {// i<=4 will through AIB
			System.out.println(a[i]);
		}

		// .length
		System.out.println(a.length);
		System.out.println("-------");
		// for each loop: enhance loop
		for (int e : a) {
			System.out.println(e);
		}

		System.out.println("-------");
		System.out.println(a);// [I@41a4555e
		System.out.println(Arrays.toString(a));// [10, 20, 30, 40]

		// double array
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 23.44;
		for (double f : d) {
			System.out.println(f);
			System.out.println(Arrays.toString(d));
		}
		System.out.println("-------");
		// for loop
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

		// char array
		// in int array we cant write >11.32

		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = '1';
		System.out.println(c[0] + c[1]);// 195
		// string array:
		String emp[] = new String[3];
		emp[0] = "sourav";
		emp[1] = "mishra";
		emp[2] = "test";
		for (String e : emp) {
			System.out.println(e);

		}
		System.out.println(Arrays.toString(emp));
		
		System.out.println("-------");
		// 5. Object array-static array
		Object student[] =new Object[5];
		student[0]="Sourav";
		student[1]=30;
		student[2]= 35.12;
		student[3]=  'f' ;
		student[4]= false;
		
		
		
		for (Object obj : student) {
			System.out.println(obj);
		}
		System.out.println("-------");
		
		
		
		Object sm[] =new Object[5];
		sm[0]="Sourav";
		sm[1]=30;
		sm[2]= 35.12;
		sm[3]=  'f' ;
		sm[4]= false;
		
		
		
		for (Object e : sm) {
			System.out.println(e);
		}
		
		// deafault value
		// int :0
		// double:0.0
		// boolean:false
		// char: space
		//String :null
		// Object :null
		
		

	}

}
