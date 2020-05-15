
public class specialcharException extends Exception {
	String password;

	public specialcharException(String password) {

		this.password = password;
		System.out.println("Invalid Password, password does not have special character " + password);

	}

}
