package CollectionProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("sourav");
		al.add("mishra");
		al.add("changu");
		al.add("sourav");
		
		
		
	/*	Set<String> s=new HashSet<String>();
		
		for(String s1: al ) {
			if(s.add(s1)==false) {
				System.out.println(s1);
			}
		}
		System.out.println(s);
		System.out.println(s.add("changu"));
		
		
		*/
		for(int i=0;i<al.size();i++) {
	  //
			System.out.println(al.get(i));
	  for(int j=i+1;j<al.size();j++) {
		  if(al.get(i).equals(al.get(j))) {
			  System.out.println(al.get(j));
		  }
	  }
		}
	}
}
