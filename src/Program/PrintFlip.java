package Program;

public class PrintFlip {

	public static void main(String[] args) {
		
		
	/*	1
		12
		123
		
		int i, j;
for(i=5;i>=1;i–)
{
for(j=1;j<=i;j++)
{
printf(“%d”,j);
}
printf(“\n”);
		
		
		1234*/
		
		
		int n=5;
		
		for (int i=0;i<=n;i++){
			for(int j=1;j<i+1;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		for(int p=n-1;p>=1;p--) {
			
			for(int q=1;q<p;q++) {
				
				System.out.print(q);
			}
			
		}System.out.println("");
		
		
		
		
	}

}
