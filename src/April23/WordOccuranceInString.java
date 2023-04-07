package April23;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordOccuranceInString {
	public static void main(String[] args) {
//big black bug bit a big black dog on his big black nose
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter string");
//		String str = sc.nextLine();
		String str = "big black bug bit a big black dog on his big black big black nose";
		Map<String, Integer> map = new HashMap<String, Integer>();
		// System.out.println(str);
		String[] array = str.split(" ");
		for (String word : array) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			}else 
			map.put(word, 1);
		}
		//System.out.println(map);
	for (Map.Entry entry:map.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
		
	}
	}

}
