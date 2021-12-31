package Java_Practice_Questions;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number"); 
		int number = sc.nextInt();
		int reverse = 0;
		int num = number; 
	
		while(num!=0) {
		
			int temp = num % 10;
			
			reverse = 10 * reverse + temp;
			num = num/10;
		}
		
		if (number == reverse)
			System.out.println("The no is a Palindrome");
		else
			System.out.println("Not a Palindrome");
		
		sc.close();

	}

}
