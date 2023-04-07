package Java8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEach {

	public static void main(String[] args) {

		List<String> subList = new ArrayList<String>();
		subList.add("Maths");
		subList.add("English");
		subList.add("French");
		subList.add("Sanskrit");
		subList.add("Abacus");
		System.out.println("------------Subject List--------------");
		//subList.forEach(s -> System.out.println(s));
		subList.stream().forEach(t -> System.out.println(t));
	}
}
