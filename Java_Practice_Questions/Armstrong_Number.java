package Java_Practice_Questions;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hi! Let's find out whether a number is armstrong or not.");
		System.out.println("Please enter a number...");
		int number = sc.nextInt();
		
		int originalNum = number;
		int cube = 0;
		
		while(number != 0) {
		    int temp =	number % 10;
			cube += (int)Math.pow(temp,3);
			number/=10;
		}
		
		if(cube == originalNum)
			System.out.println(originalNum+" is an armstrong number.");
		else 
			System.out.println("Oops! sorry, it's not armstrong!");
				
		sc.close();
		
		}
	
	}