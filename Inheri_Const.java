package mc;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void dispPerInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
class Employee1 extends Person{
	int EmpId;
	String Department;

	Employee1(String name, int age, int EmpId, String Department) {
		super(name, age);
		this.EmpId = EmpId;
		this.Department = Department;	
	}
	void dispEmpInfo() {
         dispPerInfo();
         System.out.println("Emp ID: "+EmpId);
         System.out.println("Emp Department: "+Department);
	}
	
}

public class Inheri_Const {
	public static void main(String[] args) {
		Employee1 ec = new Employee1("Anu", 24, 1222, "IT");
		ec.dispEmpInfo();
	}

}
