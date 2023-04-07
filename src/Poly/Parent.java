package Poly;

public class Parent {

	public void login() {
		System.out.println("PARENT LOGIN method");
	}

	public void logout() {
		System.out.println("PARENT LOGOUT method");
	}

	public static void commonMetheod() {
		System.out.println("parent static method commonMetheod");
	}
	
	
	
	//Method specific to this class only 
	
	public void parentSpecific() {
		System.out.println("parentSpecific method called");
	}
	
	
	
	
	
	
	

}
