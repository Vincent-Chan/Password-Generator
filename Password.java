import java.util.*; 

public class Password 
{ 
	public static void main(String[] args) 
	{ 
		Scanner scanner = new Scanner(System.in);

        // The default length of the password generated is 10
		int length = 10;
		
		do
		{
        	System.out.println("Please input the length of the password: ");
        	length = scanner.nextInt();
		} while (length <= 0);

		System.out.println(generator(length)); 
	} 

	// This is where the password is generated 
	static char[] generator(int len) 
	{ 
		System.out.println("We are generating the password for you ..."); 
		 

		// A strong password should have capital characters, small characters, numbers and symbols
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
		String numbers = "0123456789"; 
		String symbols = "!@#$%^&*_=+-/.?<>()~`,:"; 


		String values = Capital_chars + Small_chars + numbers + symbols; 

		// Using random method 
		Random rand = new Random(); 

		char[] password = new char[len];

        System.out.println("Your new password is: "); 

		for (int i = 0; i < len; i++) 
		{ 
			password[i] = values.charAt(rand.nextInt(values.length())); 
		} 

		return password; 
	} 
} 
