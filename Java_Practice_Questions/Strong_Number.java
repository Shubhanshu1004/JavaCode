package Java_Practice_Questions;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = sc.nextInt(); 
		int num = number;
		
		int sum = 0;
		
		while(number != 0) {
			int fact = 1;
			int temp = number % 10;
			
			for (int i=1; i<=temp; i++) {
				fact = fact * i; 
			}
			
		sum = sum + fact;	
		number = number/10;
		
		}
		
		if (sum == num) 
			System.out.println("The entered no is a Strong number");
		else
			System.out.println("No is not Strong");
		
		sc.close();

	}

}
