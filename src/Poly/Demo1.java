package Poly;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		int[] a = { 100,12,9,11,1 };
		
		int min = a[0];
		int max = a[0];//
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max) { //12>3,9>12,11>12
				max=a[i]; //12
			}else if(a[i]<min) {
				min=a[i];
			}
				
			
		}
		System.out.println("max "+max);
		System.out.println("min "+min);
		
		
		
		
	}	
}
