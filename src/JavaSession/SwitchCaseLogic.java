
package JavaSession;

public class SwitchCaseLogic {

	public static void main(String[] args) {
		String browser = "   CHR  OME ";
		
		
		switch (browser.toLowerCase().trim().replace(" ", "")) {
		case "chrome":
			System.out.println("launch chrome");
			break;
			// if no break it will move to nxt step.always break is a good practice
		case "ff":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		//not mandatory to write default
		default:
			System.out.println("plz pass correct browser");
			//break;
		}
		
	
		//integer case also we can do but it is no recommended
		//we can not condition here like <  greater than.
		// if else is preferable
		int total =90;
		switch (total) {
		case 100:
			System.out.println("A");
			break;
			
		case 90:
			System.out.println("B");
			break;

		case 80:
			System.out.println("C");
			break;

		default:
			System.out.println("Fail");
			break;
		}
		
		// we can not use break in if else
		///ex of switch case in selenium-user level switch case
		//like Admin/super admin/vendor/partner login
		//2. diff test environment
		// cross browser/cross devices//RBAC permission/Cross cloud MS,AWS,Local,docker,//multi language
		{
		
		}

	}

}
