package Program;

import java.util.Iterator;

public class test {

	public static void main(String[] args) {



		char[] a= {'c','c','c','a','a','c','c','c','a','a'};
		int count;
		for (int i = 0; i < a.length; i++) {
			count=1;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					a[j]=0;
					count++;
					
				}
			}
			if(count>1)
			{
				System.out.print("   "+a[i]);
			}
		}



	}

}
