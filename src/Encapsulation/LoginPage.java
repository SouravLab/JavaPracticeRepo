package Encapsulation;

public class LoginPage {
	
	private String username;
	private String password;
	
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// base features: public method
	
	public void doLogin(String username,String password)
	{
		System.out.println("enter username : "+username );
		System.out.println("enter username : "+password );
		System.out.println("click on logi button...");
		System.out.println("login done");
	}
	public void doLogin()
	{
		System.out.println("enter username : "+this.username );
		System.out.println("enter username : "+this.password );
		//System.out.println("click on logi button...");
		System.out.println("login done");
	}
}
