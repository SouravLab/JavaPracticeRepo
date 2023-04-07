package Encapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1= new Customer("ram",25,"LA");// POST
		System.out.println(c1.getName());//GET
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());
		
		
		
		c1.setCity("Banglore");//Update PUT/PATCH
		System.out.println(c1.getCity());
	}

}
