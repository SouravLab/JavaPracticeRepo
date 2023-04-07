package ConstructorConcept;

public class Employee {
	
	String name;
	int age;
	String empId;
	String dept;
	
	// Constructor mean construct a object
	// 1. Constructor name will remain same as the class name
	// 2. Constructor will not have any return type/no return keyword
	// looks like method but not a method
// Const ..overload is possible
	// const will be called when you create the object
	// default const.. depends on use casee.N number of objects..
	
	//To restrict user to create uselesobject...
	
	// const vs method:
	//1. const name will remain same but method name can anything
	// 2. const have never any return but function may or may not return the value
	// 3. const will called when we create the object but method will called with object reference
	// 4. const will help to create the object of the class,we can restrict unnecessary object creation.
	// 5. method should define feature of the class but the const should not have any Businees logic/feature  
	
	
	public Employee() {
		System.out.println("default const...");
	}
	
	public Employee(int i) {
		System.out.println("1 param const..."+i);
	}
	
	public Employee(int i, String p) {
		System.out.println("2 param const..."+i+p);
	}
	

	public static void main(String[] args) {
		Employee e1 =new Employee(10);
		Employee e2 =new Employee(1,"s");
	}

}
