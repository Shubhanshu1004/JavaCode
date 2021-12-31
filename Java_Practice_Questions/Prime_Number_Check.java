package Java_Practice_Questions;

import java.util.Scanner;

public class Prime_Number_Check {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		int i;
		
		if (number == 1)
			System.out.println("Prime starts from 2");
		
		if (number == 2)
			System.out.println("2 is a prime number");
		
		for (i=2; i<number; i++) {
			
			if (number % i == 0) {
				System.out.println(number + " is not a prime number");
				break;
			}
		}
		
		if(number == i)
			System.out.println(number + " is a prime number");
		
		sc.close();
		
	}

}
