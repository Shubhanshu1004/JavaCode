package Java_Practice_Questions;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for (int j=1; j<=10; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
		}
		
		System.out.println();	

	}

}
