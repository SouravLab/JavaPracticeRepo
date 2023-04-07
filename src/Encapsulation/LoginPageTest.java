package Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) {
		
		// user1 sourav
	LoginPage u1= new LoginPage("sourav", "test@123"); 
System.out.println(u1.getUsername());
System.out.println(u1.getPassword());

//user2
	LoginPage u2= new LoginPage("user2","user2pwd");//POST call

	System.out.println(u2.getUsername());
	System.out.println(u2.getPassword());
	u2.setPassword("123145");// Update//PUT
	System.out.println(u2.getPassword());
	
	u2.doLogin(u2.getUsername(), u2.getPassword());
	LoginPage u3= new LoginPage("user3","user2pwgd");
	u3.doLogin();
	}

}
