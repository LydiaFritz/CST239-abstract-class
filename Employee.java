/**
 * 
 */
package employee;

/**
 * @author Lydia
 *
 */
public class Employee {
	private String ssn;
	private String name;
	protected int age;
	
	public Employee(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Employee class displayInfo
	 */
	public void displayInfo() {
		System.out.println("Employee name: " + name);
		System.out.println("Employee ssn: " + ssn);
	}
}
