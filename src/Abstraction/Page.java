package Abstraction;

public abstract class Page {
	
	
	
	Page(){
		System.out.println("Abstract page class default constructor");
	}
	Page(int a){
		System.out.println("Abstract page class int arg constructor");
	}
	
	public abstract void launchUrl() ;
	
	public void login() {
	System.out.println("login method of page abstract class");	
	}
	
	

}
