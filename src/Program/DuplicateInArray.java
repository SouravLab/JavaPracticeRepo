package Program;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {

		String[] str = { "java", "c", "c++", "java", "python","java","c" };
		List<String> list = Arrays.asList(str);
		Set<String> set = new HashSet<String>();
		for (String str2 : list) {
			boolean flagForDuplicate = set.add(str2);
			if (!flagForDuplicate) {
				System.out.println(str2 + " is duplicate element");
				//Collections.frequency(list, set)
			}
		}

	}

}
