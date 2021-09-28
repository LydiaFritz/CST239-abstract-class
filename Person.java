/**
 * 
 */
package people;

/**
 * @author Lydia
 *
 */
public class Person {
	
	private String name;
	private int age;
	private String city;

	/**
	 * 
	 */
	public Person(String n, int a, String c) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.age = a;
		this.city = c;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	

}
