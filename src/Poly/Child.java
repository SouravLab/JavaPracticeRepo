package Poly;

import javax.crypto.BadPaddingException;

public class Child extends Parent {
	public void login() {
		System.out.println("CHILD LOGIN method");
	}

	public void logout() {
		System.out.println("CHILD LOGOUT method");
	}

	public static void commonMetheod() {
		System.out.println("CHILD static method commonMetheod");
	}
	
	public void childSpecific() {
		System.out.println("childSpecific method called");
	}
	
	public void onlyChild() {
		System.out.println("calling onlyChild method");
	}

		public static void main(String[] args) {
			
			Child childRef =new Child();
			Parent parentRef =new Parent();
			Parent parentRefChildObj=new Child();
			
			
			childRef.login();
			childRef.logout();
			childRef.parentSpecific();
			childRef.childSpecific();  
			commonMetheod();
			childRef.onlyChild();
			
			
			System.out.println("---");
			
			parentRef.login();
			parentRef.logout();
			parentRef.parentSpecific();
			//cant call only child method
			
			
			System.out.println("---");
			
			parentRefChildObj.login();
			parentRefChildObj.logout();
			parentRefChildObj.parentSpecific();
			//cant call only child method
			
			
			
			
			
		}
	

}
