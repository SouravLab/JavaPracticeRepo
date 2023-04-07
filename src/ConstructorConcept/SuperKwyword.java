package ConstructorConcept;

class A {
	public int age = 10;

	A() {

		System.out.println("Oye");
	}

	A(int a) {
		this();
		System.out.println("Ayo");

	}
}

class B extends A {

	B() {
		super(5);

		System.out.println("Super");
	}
}

public class SuperKwyword extends A {
	int age = 15;

	SuperKwyword() {
		super.age = 20;
		System.out.println(age);
	}

	public static void main(String[] args) {

		// B b =new B();
		SuperKwyword obj = new SuperKwyword();

	}

}
