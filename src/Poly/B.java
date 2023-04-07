package Poly;

public class B extends A{
	
	public void m1() {
		System.out.println("Bm1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj=new A();
		//obj.m1();
		B obj1=new B();
		//obj1.m2();
		
		A obj3 =new B();
		obj3.m1();
		obj3.m2();
		
	}

}
