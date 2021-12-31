package Java_Practice_Questions;

import java.util.Scanner;

public class Reversing_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String input = sc.nextLine(); // input = tat
		
		String reverse = "";
		
		for (int i=0; i<input.length(); i++) {
			reverse = reverse + input.charAt(input.length() - i- 1); 		
		}
		
		System.out.print(reverse);
		System.out.println("\n");
		
		// Difference between "==" and ".equals"
		// "==" used for object reference comparison
		// ".equals" used for content comparison in String class
		if(input.equals(reverse)) { 
			System.out.println("String is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
			
		sc.close();
		
	}

}
