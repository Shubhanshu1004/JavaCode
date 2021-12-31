package String_Questions;

import java.util.Scanner;

public class Alphabet_Count {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String input = sc.nextLine();
		
		int count = 0;;
		
		for (int i=0; i<input.length(); i++) {
			if (input.charAt(i) >= 97 || input.charAt(i) <= 122  && input.charAt(i) >= 65 || input.charAt(i) <= 90) {
				count++;
			}
		}
		
		System.out.println("The no of alphabets in the string are: " + count);
		
		sc.close();
		
	}

}
