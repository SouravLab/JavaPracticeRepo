package Program;

public class EvenOddInArray {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8};
		
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			System.out.println(a[i]+" is even number");
		}
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0) {
			System.out.println(a[i]+" is odd number");
		}
	}	
		System.out.println("        ---    ");
	
	for (int c:a) {
		if(c%2==0) {
			System.out.println(c+" even number");
		}
	}
	for (int c:a) {
		if(c%2!=0) {
			System.out.println(c+" odd number");
		}
	}
	
	}
}
