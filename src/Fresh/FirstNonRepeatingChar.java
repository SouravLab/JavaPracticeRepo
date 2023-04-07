package Fresh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String s="abacabad";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else
			{
				map.put(c,1);
			}}
			for (int j = 0; j < s.length(); j++) {
				char c1=s.charAt(j);
				if(map.get(c1)==1) {
					System.out.println(s.charAt(j));
					break;
				}
				
			}
			
		}
	
	}


