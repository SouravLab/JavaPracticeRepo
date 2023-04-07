package CollectionProgram;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SteReverse {

	public static void main(String[] args) {
		Set <Integer> s= new HashSet<Integer>();
		Set <Integer> s1= new HashSet<Integer>();
		s.add(12);
		s.add(56);
		s.add(78);
		s.add(23);
		s.add(22);
		s1.add(22);
		
		s.retainAll(s1);
		System.out.println(s);
		
		//Collections.reverseOrder((Comparator<T>) s);
		
	}

}
