package Program;

import java.util.Arrays;

public class SecondLargestInArray {

	public static int getSecondLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-2];  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2,9};   
		System.out.println("Second Largest: "+getSecondLargest(a,a.length));  
	}
	}

	