package April23;

public class PatternProgram_1 {

	public static void main(String[] args) {

		/*
		 * 1 
		 * 12 
		 * 123 
		 * 1234 
		 * 12345
		 */
//		1
//		12
//		123
//		1234
//		12345
//		1234
//		123
//		12
//		1
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(1);
			}
			System.out.println();
		}
		////////////
        for (int k = 4; k>=1; k--) {
			
			for (int l = 1; l <=k ; l++) {
				
				System.out.print(1);
			}
			System.out.println();
		}

	
	
	String name= "Venkatesh";
	//Venkates
//	Venkate
	for(int i=name.length();i>=0;i--) {
		
		for(int j=0;j<
				i;j++) {
			//char c= c+name.charAt(i);
			System.out.print(name.charAt(j));
		}
		System.out.println();
	}
	
	
	}

}
