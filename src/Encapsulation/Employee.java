package Encapsulation;

public class Employee {
// every const has a hidden const/

	private String name;
	private int age;
	private double salary;

	// getter/setter
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}
   public String getInfo() {
	return name+":"+ age+":"+ salary;
   }
	public void SetInfo (String name,int age,double salary) {
		this.name =name;
		this.age=age;
		this.salary=salary;
}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
