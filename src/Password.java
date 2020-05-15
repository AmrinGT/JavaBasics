import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Password {

	public static void main(String[] args) {

		String filename = "C:\\Users\\Mahesh K\\Desktop\\Java Exception\\Password.txt";

		File file = new File(filename);
		String[] passwords = new String[13];

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < passwords.length; i++) {

				passwords[i] = br.readLine();

				// System.out.println(password[i]);

			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found with the name" + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cannot Read the file" + filename);
			e.printStackTrace();
		}

		for (String password : passwords) {

			Boolean numpass = false;
			Boolean alphapass = false;
			Boolean specialchar = false;

			for (int n = 0; n < password.length(); n++) {

				if ("0123456789".contains(password.substring(n, n + 1))) {
					// System.out.println("Number is available at " + n + " position " + password);
					numpass = true;
				} else if ("qwertyuiopasdfghjklzxcvbnm".contains(password.substring(n, n + 1))) {
					// System.out.println("aphabet is available at " + n + " position " + password);
					alphapass = true;

				} else if ("*=@#$%()>&,.{}-;:".contains(password.substring(n, n + 1))) {

					// System.out.println("Special character is available at " + n + " Position " +
					// password);
					specialchar = true;

				} else {
					// System.out.println(" There is no Num,Special char,Alpha at " +n+ " Position
					// ");
				}
			}
			try {

				if (numpass == false) {
					// System.out.println("Error");

					throw new NumberException1(password);

				} /*
					 * else { System.out.println("Valid Password" +password); }
					 */

			} catch (NumberException1 e) {

			}
			try {
				if (alphapass == false) {
					throw new AlphaException(password);
				}
			} catch (AlphaException e) {

			}
			try {
				if (specialchar == false) {
					throw new specialcharException(password);
				}
			} catch (specialcharException e) {

			}
		}

	}
}
