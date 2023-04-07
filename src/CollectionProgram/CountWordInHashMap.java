package CollectionProgram;

import java.util.HashMap;
import java.util.Map;

public class CountWordInHashMap {

	public static void main(String[] args) {

		String s = "aabccccccccc";
		System.out.println(s.length());
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}

		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			//System.out.println(entry.getKey()+" " +entry.getValue());
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
	}}
