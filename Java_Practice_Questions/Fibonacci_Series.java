package Java_Practice_Questions;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be printed");
        int count= sc.nextInt();
        
        int number1 = 1;
        int number2 = 1;
        int number3;
        
        System.out.print(number1+" "+number2);
        
        for (int i=2;i<count;i++) {
           
        	number3 = number1 + number2;
            System.out.print(" "+number3);
            
            number1 = number2;
            number2 = number3;
        }
		
		sc.close();
		
	}

}
