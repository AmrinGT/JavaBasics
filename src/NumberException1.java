
public class NumberException1 extends Exception {
	String password;

	public NumberException1(String password) {
		this.password = password;
		System.out.println("Invalid password as there is no Number in the password: " + password);

	}

}
