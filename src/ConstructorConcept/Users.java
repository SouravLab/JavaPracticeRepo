package ConstructorConcept;

public class Users {

	String name;
	int userId;
	boolean isPrime;
	String city;

//	public Users(String name1, int userId1) {
//		name=name1;
//		userId=userId1;
//	}

	public Users(String name, int userId) {
		this.name = name;
		this.userId = userId;
	}
	public Users(String name) {
		this.name = name;
	}
	public Users(String name,int userId,boolean isPrime,String city) {
		this.name = name;
		this.userId = userId;
		this.isPrime = isPrime;
		this.city = city;
	}

	public static void main(String[] args) {
		Users u1 = new Users("sourav", 100);
		System.out.println(u1.name);
		System.out.println(u1.userId);
		System.out.println(u1.isPrime);
		System.out.println(u1.city);
		Users u2 = new Users("sourav");
		Users u3 = new Users("sourav", 101, true, "BLR");
		System.out.println(u3.name+" "+u3.userId+" "+u3.isPrime+" "+u3.city);

	}

}
