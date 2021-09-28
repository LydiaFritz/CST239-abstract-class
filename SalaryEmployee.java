/**
 * 
 */
package employee;

/**
 * @author Lydia
 *
 */
public class SalaryEmployee extends Employee {

	private double salary;
	/**
	 * @param ssn
	 * @param name
	 */
	public SalaryEmployee(String ssn, String name, double sal) {
		super(ssn, name);
		this.salary = sal;		
	}
	

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * Salary class displayInfo
	 */
	public void displayInfo() {
		//call base class version
		System.out.println(name);
		System.out.println(age);
		super.displayInfo();
		System.out.printf("Salary is $%.2f.%n", salary);
	}

}
