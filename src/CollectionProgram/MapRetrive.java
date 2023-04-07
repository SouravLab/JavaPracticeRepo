package CollectionProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetrive {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("Oissa", "Bhubaneswar");
		map.put("Karnataka", "Bangalore");
		map.put("AndhraPradesh", "Hyderabad");
		map.put("TamilNadu", "Chennai");
	
//          Set<Map.Entry<String,String>>	entries=map.entrySet();
//		 
//		Iterator<Map.Entry<String,String>> itr= entries.iterator();
//		
//		while(itr.hasNext()) {
//		Map.Entry<String,String> entry=itr.next();
//		System.out.println(entry.getKey()+"   "+entry.getValue());}
		
		for(Map.Entry<String, String> entries:map.entrySet()) {
			System.out.println(entries.getKey()+" "+entries.getValue());
		}

	}

}
