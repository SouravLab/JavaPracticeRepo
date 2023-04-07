package String;

public class TrimSpace {

	public static void main(String[] args) {
		String s = "             a b cdd bn lls  lkljjjjjjjjjjjj            jjj            ";
		String trim = s.trim();
		System.out.println(trim);
		String trim1=trim.replaceAll(" ", "");
        System.out.println(trim1);
		char[] c = s.toCharArray();

		for (char d : c) {
			
		}

	}
	
	
	/*   public static void main(String[] args) {  
		   String s="sourav mishra java testing  ";
	        char[] JavaCharArray = s.toCharArray();
	        for (char c:JavaCharArray) {  
	        System.out.print(c);  
	        
	        }  
	    }  */
	}


