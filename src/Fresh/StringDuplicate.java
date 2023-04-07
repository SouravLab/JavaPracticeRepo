package Fresh;

public class StringDuplicate {

	public static void main(String[] args) {
//		
//		for(int i = 0; i <string.length; i++) {  
//			count = 1;  
//			for(int j = i+1; j <string.length; j++) {  
//				if(string[i] == string[j] && string[i] != ' ') {  
//					count++;  
//					//Set string[j] to 0 to avoid printing visited character  
//					string[j] = '0';  
//				}  
//			}  
//			//A character is considered as duplicate if count is greater than 1  
//			if(count > 1 && string[i] != '0')  
//				System.out.println(string[i] + "-"+ count);  
//		}  
		
		
		

		String s = "java python c selenium java c java python c selenium java c";
		String split[] = s.split(" ");
		int len = split.length;
		for (int i = 0; i <= len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (split[i].equals(split[j])) {
					System.out.println("duplicate word is :" + split[j]);
				}
			}
		}

	}

}
