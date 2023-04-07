package JavaSession;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// collection
		//Arraylist-default class
		//Dynamic array
		//Object of arraylist
		ArrayList ar =new ArrayList();
		System.out.println(ar.size());//physical size>0
		ar.add(100);//0
		ar.add(200);//1
		ar.add("sourav");//2
		ar.add("mishra");//3
		//lowest index=0
		// higest is =3
		ar.add(300);
		System.out.println(ar.size());//physical size>5
		// 1st time default size is 10, then total  physical size/2
		System.out.println(ar.get(0));
		//System.out.println(ar.get(5));//IndexOutOfBoundsException
		//System.out.println(ar.get(-1));//IndexOutOfBoundsException but in Array it was ArrayIndexOutOfBoundsException
		ArrayList ar2= new ArrayList();
		ar2.add(100);//0
		ar2.add(100);//1
		ar2.add(null);//2
		ar2.add(null);//3
		System.out.println(ar2.size());
		System.out.println(ar2.get(1));
		System.out.println(ar2.get(2));
		System.out.println(ar2.get(3));
		ar2.add(4,200);
	//	ar2.add(9,1000);
		System.out.println(ar2.get(4));
	//	System.out.println(ar2.get(9));//IndexOutOfBoundsException
		// Array list is stored orderbased/index based 
		ar2.add(3,1100);
		System.out.println(ar2.get(3));// 1100 ..replace null value
		
		//delete
		System.out.println("-------------");
		ArrayList prod =new ArrayList();
		prod.add("A");
		prod.add("B");
		prod.add("C");
		prod.add("D");
		prod.add("E");
		System.out.println(prod.size());//5
		System.out.println(prod.get(3));
	prod.remove(3);
	System.out.println(prod.size());//4
		System.out.println(prod.get(3));//E
		
		//int arraylist
		
		
		ArrayList<Integer> marks =new ArrayList<Integer>();
		marks.add(100);
		ArrayList<Double > sal =new ArrayList<Double>();
		//ArrayList<String > empList =new ArrayList<String>();
		//name,age,gender,sal,boolean
		
		
		
		
		ArrayList<String > empList =new ArrayList<String>();
		
		empList.add("sourav1");
		empList.add("sourav1");
		empList.add("sourav1");
		empList.add("sourav1");
		empList.add("mishra");
		for (String emp : empList) {
		System.out.println(emp);	
		}
		
		System.out.println("---");
		
		
ArrayList<Object > empData =new ArrayList<Object>();
		
		empData.add("Tom");
		empData.add(30);
		empData.add('m');
		empData.add(12.33);
		empData.add(true);
	System.out.println(empData);
	System.out.println(empData.size());
	
	for(Object obj:empData) {
		
		System.out.println(obj);
		if(obj.equals('m')) {
			System.out.println("male emp");
		}
		
	}
	}
		

}
