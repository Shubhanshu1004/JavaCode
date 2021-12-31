package Java_Practice_Questions;

import java.util.Scanner;

public class Max_Min_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter three positive numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
	
		maxNumber(num1, num2, num3);
		minNumber(num1, num2, num3);
		
		sc.close();
		
	}
	
	public static int maxNumber(int num1, int num2, int num3) {
		 
		 int greatest = 0;
		 
		 if (num1 > num2) {
			 if (num1 > num3) {
				 greatest = num1;
			 }
			 else {
				 greatest = num3;
			 }
		 }
		 else {
			 if (num2 > num3) {
				 greatest = num2;
			 }
			 else {
				 greatest = num3;
			 }
		 }
		 
		 System.out.println("The highest no is: " + greatest);
		 return greatest;
	}
	
public static int minNumber(int num1, int num2, int num3) {
		
		 int lowest = 0;
		 
		 if (num1 > num2) {
			 if (num2 > num3) {
				 lowest = num3;
			 }
			 else {
				 lowest = num2;
			 }
		 }
		 else {
			 if (num1 > num3) {
				 lowest = num3;
			 }
			 else {
				 lowest = num1;
			 }
		 }
		 
		 System.out.println("The lowest no is: " + lowest);
		 return lowest;
		 
	}

}
