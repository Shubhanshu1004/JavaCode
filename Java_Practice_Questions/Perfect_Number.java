package Java_Practice_Questions;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<number; i++) {
			
			if (number % i == 0) {
				sum = sum + i;
			}
			
		}
		
		if (sum == number)
			System.out.println("The no is a Perfect number");
		else
			System.out.println("Not a perfect number");
		
		sc.close();

	}

}
