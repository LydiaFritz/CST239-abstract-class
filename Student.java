/**
 * 
 */
package people;

/**
 * @author Lydia
 *
 */
public class Student extends Person {
	
	private double gpa;
	private String major;

	/**
	 * @param n
	 * @param a
	 * @param c
	 */
	public Student(String n, int a, String c) {
		super(n, a, c);
		this.gpa = 0.0;
		this.major = "undecided";
	}

}
