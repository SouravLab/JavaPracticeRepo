package April23;

import java.util.LinkedHashSet;
import java.util.Set;

public class Count_Vowels_In_String{

	public static void main(String[] args) {
		String s= "souravmishra";
		int count=0;
		Set<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			
			
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' ) {
				//System.out.print(s.charAt(i));
				
				set.add(s.charAt(i));
				count++;
				
			}
			
		}
		
		for(char c: set) {
			System.out.println(c);
		}
		

	}

}
