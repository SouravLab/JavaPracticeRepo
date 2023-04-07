package Program;

import java.util.Arrays;

public class MinAndMaxValueOfAnArray {

	public static void main(String[] args) {
		int []a= {10,20,80,60,98,34};
		int max=a[0];
		int min=a[0];
		Arrays.sort(a);
		System.out.println("min is " + a[0]);
		System.out.println("max is " + a[a.length-1]);
		
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}System.out.println("max no is "+max);
		
		 min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}System.out.println("min no is "+min);
		
		
		

	}

}
