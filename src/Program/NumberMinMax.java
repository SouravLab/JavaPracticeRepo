package Program;

public class NumberMinMax {

	public static void main(String[] args) {

		int n = 107701;

		int temp, max = 1, min = 0;
		while (n != 0) {
			temp = n % 10;

			if (temp > max) {
				max = temp;
			} else if (temp < min) {
				min = temp;
			}

			n = n / 10;
		}
		System.out.println(min + " --" + max);
	}
}






/*
 * 
 * if(a[i]>max) { //12>3,9>12,11>12 max=a[i]; //12 }else if(a[i]<min) {
 * min=a[i]; }
 */