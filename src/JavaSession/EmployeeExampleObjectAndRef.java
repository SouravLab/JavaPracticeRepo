package JavaSession;

public class EmployeeExampleObjectAndRef {

	String name;
	int age;
	String city;
	double salary;
	boolean isPerm;
	char gender;

	public static void main(String[] args) {
		// e1 -> object ref name
		// RHS -> new Employee(); - is the Object
		// Employee -> class/ type of t1
		// non prim data type

		EmployeeExampleObjectAndRef e1 = new EmployeeExampleObjectAndRef();

		e1.name = "sourav";
		e1.age = 25;
		e1.city = "bbsr";
		e1.salary = 12.33;
		e1.isPerm = true;

		EmployeeExampleObjectAndRef e2 = new EmployeeExampleObjectAndRef();
		e2.name = "Modi";
		e2.age = 60;
		e2.city = "Delhi";
		e2.salary = 19.33;
		e2.isPerm = false;

		EmployeeExampleObjectAndRef e3 = new EmployeeExampleObjectAndRef();
		e3.name = "Raj";
		e3.age = 30;
		e3.city = "mumbai";
		e3.salary = 29.33;
		e3.isPerm = false;

		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary + " " + e1.isPerm);
		System.out.println(e2.name + " " + e2.age + " " + e2.city + " " + e2.salary + " " + e2.isPerm);
		System.out.println(e3.name + " " + e3.age + " " + e3.city + " " + e3.salary + " " + e3.isPerm);
		System.out.println("------");
		
		e1 = e2;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary + " " + e1.isPerm);
		System.out.println(e2.name + " " + e2.age + " " + e2.city + " " + e2.salary + " " + e2.isPerm);
		System.out.println(e3.name + " " + e3.age + " " + e3.city + " " + e3.salary + " " + e3.isPerm);
		System.out.println("------");
		
		e2 = e3;
		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary + " " + e1.isPerm);
		System.out.println(e2.name + " " + e2.age + " " + e2.city + " " + e2.salary + " " + e2.isPerm);
		System.out.println(e3.name + " " + e3.age + " " + e3.city + " " + e3.salary + " " + e3.isPerm);
		System.out.println("------");
		
		e3 =e1;
		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary + " " + e1.isPerm);
		System.out.println(e2.name + " " + e2.age + " " + e2.city + " " + e2.salary + " " + e2.isPerm);
		System.out.println(e3.name + " " + e3.age + " " + e3.city + " " + e3.salary + " " + e3.isPerm);
		System.out.println("------");
		
	}

}
