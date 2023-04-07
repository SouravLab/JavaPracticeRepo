package JavaSession;

public class Browser {
	
	// launch a browser
	// input param: name(string):ff//ch//sf/ff
	// return: void
	public boolean launchBrowser(String name) {
		System.out.println("browser name is: "+ name);
		if (name.equals("chrome")) {
			System.out.println("launch chrome");
			return true;
		}else if(name.equals("firefox")) {
			System.out.println("launch firefox");
			return true;
		}else if(name.equals("safari")) {
			System.out.println("launch safari");
			return true;
		}else if(name.equals("IE")) {
			System.out.println("launch IE");
			return true;
		} else System.out.println("please pass the right browser...");
		return false;
		
	}
	//// above scenario using switch case:
	public boolean OpenBrowser(String brName) {
		System.out.println(" browser name: " +  brName);
		switch (brName.toLowerCase()){  //can not write condition here like <,>,= 
		case "chrome":
			System.out.println("launch chrome");
			return true;// return and break at a time we can not write together
			
		case "ff":
			System.out.println("launch ff");
			return true;
		case "ie":
			System.out.println("launch ie");
			return true;
		default:
			System.out.println("plz pass right browser "+ brName);
			return false;
		}
	}
	
// main method will never return anyting
	public static void main(String[] args) {
		Browser br = new Browser();
		boolean flag=br.OpenBrowser("safari");
		System.out.println(flag);
		
		
		
//		  if( br.launchBrowser("opera")) 
//		  { System.out.println("br launched"); 
//		  }else {
//		  System.out.println("Tc failed"); }
		 
		
	}

}
