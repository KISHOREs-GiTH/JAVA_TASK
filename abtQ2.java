package mc;

abstract class Employee{
	abstract void calculateSalary();
	public void dispRole() {
		System.out.println("Concrete method....");
	}	
}
class Manager extends Employee{

	@Override
	void calculateSalary() {
		System.out.println("The employee salary is calculated using tha manager cls..");
	}
}

public class abtQ2 {
	public static void main(String[] args) {
		Employee em = new Manager();
		em.calculateSalary();
		em.dispRole();
	}

}
