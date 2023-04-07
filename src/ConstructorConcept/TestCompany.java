package ConstructorConcept;

import java.util.ArrayList;

public class TestCompany {

	public static void main(String[] args) {
		
		Company c1 =new Company("flipkart");
		System.out.println(c1.name);//flpkart
		System.out.println(c1.empCount);//0
		System.out.println(c1.catList);//null
		
		
		
		Company c2 =new Company("Amazon",10000);
		System.out.println(c2.name);//Amazon
		System.out.println(c2.empCount);//0
		System.out.println(c2.sharePrice);//0.0
		
		
		ArrayList<String> walList =new 	ArrayList<String>();
		walList.add("Fashion");
		walList.add("Electronics");
		walList.add("Sports");
		
		
		Company c3 =new Company("walmart",20000,walList,true,200.22);
		System.out.println(c3.name);//Amazon
		System.out.println(c3.empCount);//0
		System.out.println(c3.sharePrice);//0.0
		System.out.println(c3.catList);
		System.out.println("===");
		System.out.println(c3.name+" "+c3.empCount +" "+ c3.catList +"  "+ c3.isFunded +" "+c3.sharePrice);

	}

}
