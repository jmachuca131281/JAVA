package password_jm;


import java.util.Scanner;

public class password_jm {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean valid = false;
		String password;

		do
		{ // start a loop
			System.out.print("Remember this\n" +
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.):\n");
			System.out.print("Please enter password and then hit enter:");// Asks user to enter password
			password = sc.nextLine();

			if (password.length() < 8)// Checks to see if password is at least 8 characters. 
			{
				valid = false;
				System.out.println("Password must have at least 8 characters");
				continue; // skip to next iteration
			}

			for (int i = 0; i < password.length(); i++)// Checks each character to see if it is acceptable.
			{
				char c = password.charAt(i);
				if (('a' <= c && c <= 'z') // Checks if it is a lower case letter
					|| ('A' <= c && c <= 'Z') //Checks if it is an upper case letter
					|| ('0' <= c && c <= '9') //Checks to see if it is a digit
					|| ('¡' <= c && c <= '€'))//Checks to special charecter
				{
					valid = false;
				}
				else
				{
					System.out.println("Only letter & digits are acceptable.");// tells the user that only letters & digits are allowed
					valid = false;
					break;
				}
			}
		} while (!valid); // verify if the password is valid, if not repeat the process
		System.out.println("Password Accepted");// if the password is valid, tell the user it's accepted
		System.out.println("Wow this is a Password segure");
	}

}
