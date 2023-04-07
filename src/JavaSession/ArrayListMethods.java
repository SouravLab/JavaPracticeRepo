package JavaSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
ArrayList<String > empList =new ArrayList<String>();
		
		empList.add("sourav1");
		empList.add("A");
		empList.add("x");
		empList.add("m");
		empList.add("t");
		
System.out.println(empList);
//sort
Collections.sort(empList);
System.out.println(empList);
Collections.sort(empList, Collections.reverseOrder());
System.out.println(empList);
System.out.println("========");
// reverse order by for loop
ArrayList<String > stList =new ArrayList<String>();
stList.add("ram");
stList.add("Ann");
stList.add("xbn");
stList.add("mi");
stList.add("tp");
for(int i=stList.size()-1;i>=0;i--) {
	System.out.println(stList.get(i));
}
System.out.println("========");
ArrayList<String > trList =new ArrayList<String>();
stList.add("ram1");
stList.add("Ann1");
stList.add("xbn1");
stList.add("mi1");
stList.add("tp1");
trList.addAll(stList);
System.out.println(trList );

List<Integer> data= Arrays.asList(10,20,30);
System.out.println(data);
List<String> names= Arrays.asList("A","AA","aAa");
System.out.println(names);
int dd[]= {1,2,2,2,4,3,6,9,};//int literal array
System.out.println(dd.length);
String s1 =new String("hello");// string object

	}

}
