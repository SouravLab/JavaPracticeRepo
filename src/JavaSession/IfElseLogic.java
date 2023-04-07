package JavaSession;

public class IfElseLogic {

	public static void main(String[] args) {
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
			//break; will not allow here with if else
			
		}
		else if(browser.endsWith("ff")) {
			System.out.println(" launch ff");
		}
		
		else if(browser.endsWith("safari")) {
			System.out.println(" launch safari");
			//break; here also it will not allow  with if else
			
		}
		else if(browser.endsWith("ie")) {
			System.out.println("launch ie");
			
		}
		
		else{System.out.println(" plz pass right browser");
			
		}
		
		///checking dead code ..dead code is not working if we declare flag earlier 
		boolean flag= false;
		if(true) {
			System.out.println("hi");
		}
		
		
	}

}
