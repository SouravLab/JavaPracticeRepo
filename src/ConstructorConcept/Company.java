package ConstructorConcept;

import java.util.ArrayList;

public class Company {
	
	// without main method 
	
	String name;
	int empCount;
	ArrayList<String>catList;
	boolean isFunded;
	double sharePrice;
	// restrict any one can not create object by using const..
	
	 public Company(String name){
		 this.name=name;
	 }
	 public Company(String name,int empCount){
		 this.name=name;
		 this.empCount=empCount;
	 }
	 public Company(String name,int empCount,ArrayList<String>catList){
		 this.name=name;
		 this.empCount=empCount;
		 this.catList=catList;
	 }
	 public Company(String name,int empCount,ArrayList<String>catList,boolean isFunded,double sharePrice){
		 this.name=name;
		 this.empCount=empCount;
		 this.catList=catList;
		 this.sharePrice=sharePrice;
		 this.isFunded=isFunded;
	 }
	
	

}
