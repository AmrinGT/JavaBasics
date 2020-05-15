
public class AlphaException extends Exception {

	String password;

	public AlphaException(String password) {
		this.password = password;
		System.out.println("Invalid password, password does not have alphabets: " + password);
	}

}
