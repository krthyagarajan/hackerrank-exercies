package com.training.hackerrank;

public class PasswordDecrypter {

	public static String decryptPassword(String password) {

//		assertEquals("hAck3rr4nk", LoginController.decryptPassword("43Ah*ck0rr0nk"));
		
		
		StringBuilder originalString = new StringBuilder();

		int numbersCount = getNumbersCount(password);
		int numbers =Integer.parseInt(password.subSequence(0, numbersCount).toString());
		System.out.println(numbers);
		password = password.substring(numbersCount);
		System.out.println(password);


		for(int i = 0; i < password.length(); i++) {




			char c = password.charAt(i);

			if(c == '*') {

			}
			else if(c == '0') {

			}

		}



		return originalString.toString();
	}


	private static int getNumbersCount(String password) {
		int count = 0;
		for(int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if(c == '0') {
				count++;
			}
		}
		return count;
	}



	
	
	
}
