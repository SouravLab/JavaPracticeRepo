package Fresh;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		int array[] = {4,8,6,7,34,4,};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println("duplicate value is : "+array[i]);
				}
			}
			
			
			
		}
		
		
		
		
	}

}
