package JavaSession;

public class IncrementalDecremental {

	public static void main(String[] args) {
		// post increment//increase the value
		// '++' is Written after 'a' so 1st assign the value 1st

		int a = 1;
		int b = a++;
		System.out.println(a);// 2
		System.out.println(b);// 1

		int c = -99;
		int d = c++;//       increase the value later first give the value to d
		System.out.println(c);// -98
		System.out.println(d);// -99

		// 2. Pre increment
		int h = 1;
		int g = ++h;// 1st increase then assign.so h became 2
		System.out.println(h);// 2
		System.out.println(g);// 2

		int l = -98;
		int i = ++l;
		System.out.println(l);// 97// 1st increase then assign
		System.out.println(i);// 97

		int t = 10;
		System.out.println(t++);// 10
		System.out.println(t);// 11
		System.out.println(t++);// 11
		System.out.println(t);// 12

		// post decrement

		int s = 2;
		int q = s--;
		System.out.println(s);// 1
		System.out.println(q);// 2

		// pre decrement

		int u = 2;
		int o = --u;
		System.out.println(u);// 1
		System.out.println(o);// 1
		double m = 12.33;
		System.out.println(++m);// 13.33
		char c1 = 'a';
		System.out.println(++c1);// b
		System.out.println((int) ++c1);// 99

	}

}
