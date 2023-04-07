package JavaSession;

class LoopsConcept {

	public static void main(String[] args) {
// use cases: when we are not sure how many iteration will perform
// page loading
		// example
// web element is coming on the page after 10/20/25/5 sec
// pagination 1 2 3 4 5..100	

		// carousel handling
//1. While loop:
		// 1 to 10 print

		/*
		 * int i =1; while(i<=10) { System.out.println(i);//111111....infinite }
		 */

		int j = 1;
		while (j <= 10) {
			System.out.println(j);// 1 to 10;
			// j++;
			// j=j+1;//1to10
			++j;// 1 to 10
		}
		/*
		 * while(true) { System.out.println("welcome to India"); }//infiite
		 */

		boolean flag = true;
		int num = 1;
		while (flag) {
			System.out.println("hi flag");// 4 times it will print
			num++;
			if (num == 5) {
				break;// here break used due to while loop
			}
		}
		System.out.println("-------------------------------");

		// use cases: we have to use when we know how many iteration we have to perform
		// 1 to 10 array
		// drop down//arraylist//jan dec
		// print webelement
		// Calendar/date
		// 2. for loop:
		/*
		 * for (int k=1;k<=10;k++) { System.out.println(k); }//1 t0 10;
		 */
		/*
		 * int k = 1; for (; k <= 10; k++) { System.out.println(k);//1 t0 10; }
		 */

		int k = 1;
		for (; k <= 10;) {
			System.out.println(k);// 1 t0 10;
			k++;
		}
		System.out.println("-------------------------------");

		/*
		 * //infinite loop for(;;) { System.out.println("hello"); }
		 */

		for (double d = 1.1; d <= 10.5;) {
			System.out.println(d);// 1.1 to 10.1

			d = d + 0.1;// precession
		}

		System.out.println("-------------------------------");
		for (char c = 'a'; c <= 'z'; c++) {
			// System.out.println(c);//a to z
			// print ascii table
			System.out.println(c + ":" + (int) c);
		}

		System.out.println("-------------------------------");
		for (char b = 'A'; b <= 'Z'; b++) {
			System.out.println(b + ":" + (int) b);//

			System.out.println("-------------------------------");
			System.out.println("----------odd even---------------------");

			// 1 3 5 7 9 odd numbers

			for (int odd = 1; odd <= 9; odd = odd + 2) {
				System.out.println(odd);
				// odd=odd+2;//1 to 9 odd
			}
			// by using % operator

			for (int e = 1; e <= 10; e++) {
				if (e % 2 == 0) {
					System.out.println(e + ":" + "even");

				} else {
					System.out.println(e + ";" + "odd");
				}

			}
		}
		System.out.println("-------------------------------");

		for (int l = 1; l <= 100; l++) {
			System.out.println(l);

			if (l % 5 == 0) {
				System.out.println("Hi");

			}
		}
		System.out.println("-------------------------------");

		// 3. do while loop:
		int p = 1;
		do {
			// p++;//1 to 11---tricky
			System.out.println(p);
			p++;
		} // while(p<=10);// 1 to 10;
		while (p >= 10); // 1
	}

}
