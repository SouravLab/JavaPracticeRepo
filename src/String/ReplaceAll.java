package String;

import java.util.HashMap;
import java.util.Map;

public class ReplaceAll {

	public static void main(String[] args) {
		/*
		 */
		// String s = "5544s o5555cccc urav101";
		// String s1 = s.replaceAll("[0-9]", "");
		// System.out.println(s1.replaceAll("\\s", ""));// soccccurav

		String k = "100";

		System.out.println(k);
		int i = Integer.parseInt(k);
		System.out.println(i);

		/*
		 * "I a#m S@ou$%^ra@v";
		 * 
		 * I am Sourav#@$%^@
		 */

		String s = "!I a#m S@ou$%^ra@v";

		String spl = s.replaceAll("[a-zA-z0-9 ]+", "");
		String spl1 = s.replaceAll("[$&+^,:;=?@#|'<>*()%!]+", "");
		System.out.println(spl);
		System.out.println(spl1 + spl);

		int bal = 500;
		String l = String.valueOf(bal);
		System.out.println(l + 30);// 50030

		String a = "i am an automation tester";

		System.out.println(a.indexOf("automation"));
System.out.println("-");
		String k1 = a.substring(a.indexOf("automation") +11);
		System.out.println(k1);

		String org = "souravmishra";
		System.out.println(org.charAt(2));
		char[] c1 = org.toCharArray();
		System.out.println(c1[3]);
		Map map = new HashMap();
		
		Map map1 = new HashMap();
		map1.put(101, "sm");
		map1.put(102, "sm2");
		System.out.println(map1.get(101));
		//System.out.println(map1.get();
		
        int count =0;
		for(int j=0;j<=c1.length;j++) {
			
		
		if (map.containsKey(j)) {
			map.put(j, count);
		}
		
		}
		String input_str ="abccdddeee";
		
		HashMap<Character, Integer> my_map = new HashMap<Character, Integer>();
	      char[] str_array = input_str.toCharArray();
	      for (char c : str_array){
	    	  
	         if (my_map.containsKey(c)){
	            my_map.put(c, my_map.get(c) + 1);
	         }else{
	            my_map.put(c, 1);
	         }
	      }
	      System.out.println(my_map);
	      
	      
			/*
			 * for (Map.Entry entry : my_map.entrySet()){ System.out.println(entry.getKey()
			 * + " " + entry.getValue()); }
			 * 
			 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
