package ConstructorConcept;

public class ConstructorCalling {
	String name;
	int age;
	double salary;

	public ConstructorCalling(String name) {
		this.name = name;
	}

	public ConstructorCalling(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public ConstructorCalling(String name, int age, double salary) {
// constructor calling by this()
		// always should be in first line

		this("mishra");
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		ConstructorCalling obj = new ConstructorCalling("sourav", 32, 22.25);
		System.out.println(obj.name);

		ConstructorCalling obj1 = new ConstructorCalling("name");
		System.out.println(obj1.age);// 0
		System.out.println(obj.age);// 32
	}

}
