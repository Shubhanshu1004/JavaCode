package Java_Practice_Questions;

import java.util.Scanner;

public class Lcm_Calculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int number1 = sc.nextInt();//9
		int number2 = sc.nextInt();//7
		
		int result = 1;
		int lcm = 1; 
		
		if(number1>number2) {
			for (int i=1; i<=number2; i++) {
				result = number1 * i;
				if (result % number2 == 0) {
					lcm = result;
					break;
				}
				else {
					continue;
				}
			}
		}
		
		else {
			for (int i=1; i<=number1; i++) { 
				result = number2 * i; 
				if (result % number1 == 0) { 
					lcm = result;
					break;
				}
				else {
					continue;
				}
			}
		}
		
		System.out.println(lcm);
		
		sc.close();
		
	}

}
