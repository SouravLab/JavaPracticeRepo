package JavaSession;

public class Users {
	// methods:
	// method should be parallel to each other
	// method can not create inside method
	// duplicate can not create method but i can overload

	// 1. no input and no return--void
	// void: can not return anything
	public void test() {
		System.out.println("test method...");
	}

	// 2. no input and some return
	public int getnumber() {
		System.out.println("get number method");
		return 100;
	}

	public String getHumanName() {
		System.out.println("get human name");
		String name = "sourav";
		return "name";
	}

	public boolean isForgotPWDLinkExist() {
		System.out.println("check forgot password link");
		return true;
	}

	// 3. some input and some returns:
	public int add(int a, int b) {// parameters
		System.out.println("add method");
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		Users obj = new Users();
		obj.test();
		int num = obj.getnumber();
		System.out.println(num);
		obj.getHumanName();
		boolean flag = obj.isForgotPWDLinkExist();
		System.out.println(flag);
		if (flag) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
		int sum =obj.add(10, 20);// arguments
		System.out.println(sum);
		 sum =obj.add(30, 40);
		System.out.println(sum+40);
	}

}
