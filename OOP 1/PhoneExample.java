package oop;

import java.util.Scanner;

//class Phone extends Object{
class Phone {
	// the instance variables
	private String theNumber, theOwnersName; // null
	private double thePrice;

	private static int count; // initialised

	// constructors
	// no-arg constructor
	Phone() { // new Phone();
		theNumber = "";
		theOwnersName = "";
		thePrice = 0.0;
		count++;
	}

	// overloaded constructor
	Phone(String aNumber, String aOwnersName, double aPrice) {
		// new Phone("087-7654321", "JB", 763.22);
		theNumber = aNumber;
		theOwnersName = aOwnersName;
		setPrice(aPrice);
		// thePrice = aPrice;
		count++;
	}

	public static int getCount() {
		return count;
	}

	// accessor methods ("get" methods)
	public String getNumber() {
		return theNumber;
	}

	public String getOwnersName() {
		return theOwnersName;
	}

	public double getPrice() {
		return thePrice;
	}

	// mutator methods ("set" methods)
//  p1.setNumber("087-654456");
	public void setNumber(String theNumber) {
		this.theNumber = theNumber;
	}

	public void setOwnersName(String aOwnersName) {
		theOwnersName = aOwnersName;
	}

	public void setPrice(double aPrice) {
		// instance variable is assigned to be the
		// same as the parameter passed in
		if (aPrice > 0) {
			thePrice = aPrice;
		}
	}

	@Override
	public String toString() {
		return "The phone details are : " + theNumber + "; " + theOwnersName + "; " + thePrice;
	}
}// end of Phone

public class PhoneExample {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 1a
//        Phone p1 = new Phone();
//        System.out.println(p1.toString());
//        System.out.println(p1);

//        p1.setNumber("087-654456");
//        p1.setOwnersName("Jack Black");
//        p1.setPrice(300.0);
//        p1.setPrice(-300.0);
//        //p1.thePrice=-9;
//        System.out.println(p1);

//        // 1b
//        Phone(String aNumber, String aOwnersName, double aPrice){
//	    Phone p2 = new Phone("087-12345", "Mary Bloggs", 200.0);
//	    System.out.println("The number is "+p2.getNumber());
//	    System.out.println("The owner is "+p2.getOwnersName());
//	    System.out.println("The price is "+p2.getPrice());
//        System.out.println(p2);
//
////        // 2.
//        String phoneNumber 	= getPhoneNumber();
//        String owner 		= getOwner();
//        double price 		= getPrice();
//
////        // create the object
//        Phone p3 = new Phone(phoneNumber, owner, price);
//        System.out.println(p3);

// Extra #1 - using a loop, enable the user to create as many phones as they like
// Extra #2 - keep a count of the number of phones created (within Phone class)
		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {
			String phoneNumber = getPhoneNumber();
			String owner = getOwner();
			double price = getPrice();

			// create the object
			Phone p3 = new Phone(phoneNumber, owner, price);
			System.out.println(p3);

			System.out.print("Continue (y/n)? ");
			cont = sc.next();
		}
		// output the number of phones created
		System.out.println("The number of objects created is " + Phone.getCount());

	}

	public static String getPhoneNumber() {
		System.out.print("Enter phone number --> ");
		return sc.next();
	}

	public static String getOwner() {
		System.out.print("Enter owner --> ");
		return sc.next();
	}

	public static double getPrice() {
		System.out.print("Enter price --> ");
		return sc.nextDouble();
	}
}
