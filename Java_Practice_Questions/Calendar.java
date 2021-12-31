package Java_Practice_Questions;

import java.util.Scanner;

public class Calendar {
	
	static String day = "";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the date in DD/MM/YYYY Format separated by space:");
		int[] DOB = new int[3];
		for(int i=0; i<DOB.length; i++) {
			DOB[i] = sc.nextInt();
		}
	
		int date = DOB[0];
		int month = DOB[1];
		int year = DOB[2];
		
		int temp_year = 0;
				
		for(int i=0; i<2; i++) {
			temp_year =  year % 100;
		}
		
		int totalDays = temp_year/4;
		totalDays = totalDays + date;
		
		int monthCode = 0;
		
		switch(month) {
		case 01 : monthCode = 1;
		break;
		
		case 02 : monthCode = 4;
		break;
		
		case 03 : monthCode = 4;
		break;
		
		case 04 : monthCode = 0;
		break;
		
		case 05 : monthCode = 2;
		break;
		
		case 06 : monthCode = 5;
		break;
		
		case 07 : monthCode = 0;
		break;
		
		case 8 : monthCode = 3;
		break;
		
		case 9 : monthCode = 6;
		break;
		
		case 10 : monthCode = 1;
		break;
		
		case 11 : monthCode = 4;
		break;
		
		case 12 : monthCode = 6;
		break;
		
		}
		
		totalDays = totalDays + monthCode;
		
//		if(month == 01 || month == 02) {
//			totalDays = totalDays - 1;
//		}
	
		int centuryCode = 0;
		
		if(year >= 1700 && year <=1799) {
			centuryCode = 4;
		} else if(year >= 1800 && year <=1899) {
			centuryCode = 2;
		} else if(year >= 1900 && year <=1999) {
			centuryCode = 0;
		} else if(year >= 2000 && year <=2099) {
			centuryCode = 6;
		}
		
		totalDays += centuryCode;
		
		totalDays += temp_year;
		
		totalDays %= 7;
			
		switch(totalDays) {
		case 1: day = "Sunday";
		break;
		case 2: day = "Monday";
		break;
		case 3: day = "Tuesday";
		break;
		case 4: day = "Wednesday";
		break;
		case 5: day = "Thursday";
		break;
		case 6: day = "Friday";
		break;
		case 7: day = "Saturday";
		break;
		}
		
		System.out.println("Hi! the day that you're looking for is "+ day);	
		sc.close();
		
	}
	
}
