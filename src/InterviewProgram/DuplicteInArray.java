package InterviewProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicteInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 8, 5, 6, 6, 1, 4, 6 ,6,1};
int j[] = {};

//System.out.println(0%10);

		/*
		 * for(int i=0;i<a.length;i++) {
		 * 
		 * for(int j=i+1;j<a.length;j++) { if(i != j && a[j] == a[i]) {
		 * System.out.println("duplicate in array is : "+ a[i]); } }
		 */
	/*	Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			// If same integer is already present then add method will return FALSE
			if (set.add(a[i]) == false && a[i]!=a[i+1]) {
				System.out.println("Duplicate element found : " + a[i]);
			}
		}*/
	}

}
