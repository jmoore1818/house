package com.house;

import java.util.Scanner;

public class SalesCenter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String uc = null;
		String ud = null;
		String uf = null;
		String userInputB=null;
		String userInputC = null;
		int housePart = 0;
		boolean userFailed = false;
		
		House ourNiceHouse = new House();
	
		System.out.println("Welcome to the Ryan Homes!");
		System.out.println("What kind of house are you looking for?  Single family, town house, etc.");
		ud = sc.nextLine();
		System.out.println("What color house would you like?");
		uc = sc.nextLine();
		System.out.println("Where would you like this house built?");
		uf = sc.nextLine();
	
		do {		
			System.out.println("How many acres do you want your house to be built on?");
			userInputB = sc.nextLine();
		
			userFailed = numberIsValid(userInputB);
		
		} while (userFailed);
		
		housePart = Integer.parseInt(userInputB);
		
		ourNiceHouse.setYardAcres(housePart);
		
		do {
			userFailed = false;
			
			System.out.println("How many bedrooms would you like?");
			userInputB = sc.nextLine();
			
			userFailed = numberIsValid(userInputB);
				
		} while (userFailed);
		
		housePart = Integer.parseInt(userInputB);
		
		ourNiceHouse.setBedrooms(housePart);
		
		do {
			userFailed = false;
			
			System.out.println("How many bathrooms would you like?");
			userInputC = sc.nextLine();
			
			userFailed = numberIsValid(userInputC);
			
		} while (userFailed);
			
			housePart = Integer.parseInt(userInputC);
			ourNiceHouse.setBathrooms(housePart);
		
		do {

			userFailed = false;
			
			System.out.println("How many fireplaces would you like?");
			userInputB = sc.nextLine();
			
			userFailed = numberIsValid(userInputB);
			
		} while (userFailed);
		
		housePart = Integer.parseInt(userInputB);
		ourNiceHouse.setFirePlaces(housePart);
		
		do {

			userFailed = false;
			
			System.out.println("How many doors leading ouside would you like?");
			userInputB = sc.nextLine();
			
			userFailed = numberIsValid(userInputB);
			
		} while (userFailed);
		
		housePart = Integer.parseInt(userInputB);
		ourNiceHouse.setOutsideDoors(housePart);
		
		do {

			userFailed = false;
			
			System.out.println("How many doors interior doors would you like?");
			userInputB = sc.nextLine();
			
			userFailed = numberIsValid(userInputB);
			
		} while (userFailed);
		
		housePart = Integer.parseInt(userInputB);
		ourNiceHouse.setInteriorDoors(housePart);
		
		do {

			userFailed = false;
			
			System.out.println("How many windows would you like?");
			userInputB = sc.nextLine();
			
			userFailed = numberIsValid(userInputB);
			
		} while (userFailed);
		
		housePart = Integer.parseInt(userInputB);
		ourNiceHouse.setWindows(housePart);	
		ourNiceHouse.setColor(uc);
		ourNiceHouse.setStyle(ud);
		ourNiceHouse.setLocation(uf);
		
		System.out.println(ourNiceHouse.toString());
		System.out.println("ACTUALLY!!  I have a " + ud + " that sounds like a perfect fit for your family!  Are you ready to sign away your life?");
		
	}

 

public static boolean numberIsValid(String someStringToMakeANumber) {
	
	try {
		
		int aNumber = Integer.parseInt(someStringToMakeANumber);
		return false;
		
	} catch (NumberFormatException e) {
		return true;
	}
	
}



}


