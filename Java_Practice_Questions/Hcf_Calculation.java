package Java_Practice_Questions;

import java.util.Scanner;

public class Hcf_Calculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter two numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int hcf = 1;
		
		for (int i=1; i<=number1 || i<=number2; i++) {
			if (number1 % i == 0) {
				if (number2 % i == 0) {
					hcf = i;
				
				}
			}
		}
		
		System.out.println("The hcf of two numbers are: " + hcf);
		
		sc.close();
		
	}

}
