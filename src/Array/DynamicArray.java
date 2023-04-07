package Array;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("Please enter Array of 5 numbers");
		for (int i = 0; i < a.length; i++) {
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
        Arrays.sort(a);
        System.out.println("Sorted Dynamic Array is "+Arrays.toString(a));
		System.out.println("Min Number is "+a[0]);
		System.out.println("Max Number is "+a[a.length-1]);
	}

}
