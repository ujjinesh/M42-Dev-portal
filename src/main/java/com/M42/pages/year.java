package com.M42.pages;

import java.util.Random;

import com.github.javafaker.Faker;

public class year {

	public static void main(String[] args) {
		String EID =emid();
		System.out.println();
		String EIDyear = EID.substring(4, 8);
		
		System.out.println("EmiratesID :"+EID);
		System.out.println("DOB Year :"+DateAndMonth()+"/"+ EIDyear);
		
		System.out.println("Random Year Between 1900 to 2006 :"+year());
	}

	public static String emid() {
		// Create an instance of the Random class
		Random random = new Random();

		// Generate a 7-digit number
		int randomNumber = random.nextInt(9000000) + 1000000; // Ensure it's 7 digits
		int lastdigit = random.nextInt(10);
		String Emid = "784"+"-"+year()+"-"+randomNumber + "-"+lastdigit;

		return Emid;
	}
	
	public static int year() { 
		// Create an instance of the Random class
				Random random = new Random();

				// Generate a random year between 1900 and 2006
				int minYear = 1900;
				int maxYear = 2006;
				int randomYear = random.nextInt(maxYear - minYear + 1) + minYear;

				//System.out.println("random yera :" + randomYear);
				 return randomYear;
	}
	
	
	public static String DateAndMonth() {
		// Create an instance of the Faker class
		Faker faker = new Faker();

		// Generate a random month (1-12)
		int month = faker.number().numberBetween(1, 13);

		// Generate a random day based on the month (1-28/29/30/31)
		int day;
		switch (month) {
		case 2: // February
			day = faker.number().numberBetween(1, 29); // Assuming leap years
			break;
		case 4:
		case 6:
		case 9:
		case 11: // April, June, September, November
			day = faker.number().numberBetween(1, 31);
			break;
		default: // January, March, May, July, August, October, December
			day = faker.number().numberBetween(1, 32);
			break;
		}

		return String.format("%02d", day) + "/" + String.format("%02d", month);

	}
}
