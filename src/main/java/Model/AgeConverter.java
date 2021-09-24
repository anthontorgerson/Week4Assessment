/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
package Model;

/**
 * @author AnthonT
 *
 */
public class AgeConverter {
	// variables
	private int age;
	private int ageIn100Years;
	private int ageIn25Years;
	private int ageIn10Years;
	private int ageIn5Years;
	private int ageIn1Year;
	
   // default no args constructor
	public AgeConverter() {
		super();
	}

	// constructor with arg
	public AgeConverter(int age) {
		this.age = age;
		setAges(age);
	}

	//getters and setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAgeIn100Years() {
		return ageIn100Years;
	}

	public void setAgeIn100Years(int ageIn100Years) {
		this.ageIn100Years = ageIn100Years;
	}

	public int getAgeIn25Years() {
		return ageIn25Years;
	}

	public void setAgeIn25Years(int ageIn25Years) {
		this.ageIn25Years = ageIn25Years;
	}

	public int getAgeIn10Years() {
		return ageIn10Years;
	}

	public void setAgeIn10Years(int ageIn10Years) {
		this.ageIn10Years = ageIn10Years;
	}

	public int getAgeIn5Years() {
		return ageIn5Years;
	}

	public void setAgeIn5Years(int ageIn5Years) {
		this.ageIn5Years = ageIn5Years;
	}

	public int getAgeIn1Year() {
		return ageIn1Year;
	}

	public void setAgeIn1Year(int ageIn1Year) {
		this.ageIn1Year = ageIn1Year;
	}
	
    // method to calculate
	public void setAges(int age) {
		final int AGE_100= 100;
		final int AGE_25 = 25;
		final int AGE_10 = 10;
		final int AGE_5 = 5;
		final int ONE = 1;
		setAgeIn100Years(age + AGE_100);
		setAgeIn25Years(age + AGE_25);
		setAgeIn10Years(age +  AGE_10);
		setAgeIn5Years(age + AGE_5);
		setAgeIn1Year(age + ONE);
	}
}
