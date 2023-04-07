package April23;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		Set set= new HashSet();
		String s="abbc";
		for(int i=s.length()-1;i>=0;i--){
			set.add(s.charAt(i));
			
		}
		String b=set.toString();
		System.out.print(b);
	}

}
