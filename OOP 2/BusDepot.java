package oop;

import java.util.Scanner;

class Bus {

    private int theNumberOfSeats;// instance var
    private static int theCount;// class var
    private String theDriversName=null;
    private String theMake=null;

    Bus() {
        theNumberOfSeats = 0;
        theDriversName = ""; // empty string != null
        theMake = "";

        theCount++;
    }

    Bus(String aDriversName, int aNumberOfSeats, String aMake) {
        theDriversName = aDriversName;
        theNumberOfSeats = aNumberOfSeats;
        theMake = aMake;

        theCount++;
    }

    public int getNumberOfSeats() {
        return theNumberOfSeats;
    }

    public void setNumberOfSeats(int aNumberOfSeats) {
        theNumberOfSeats = aNumberOfSeats;
    }

    public static int getCount() {
        return theCount;
    }

    public String getDriversName() {
        return theDriversName;
    }

    public void setDriversName(String aDriversName) {
        theDriversName = aDriversName;
    }

    public String getMake() {
        return theMake;
    }

    public void setMake(String aMake) {
        theMake = aMake;
    }

    @Override
    public String toString() {
        return "Bus{" + "theNumberOfSeats=" + theNumberOfSeats + ", theDriversName=" + theDriversName + ", theMake=" + theMake + '}';
    }

}

public class BusDepot {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Bus b1 = new Bus();
        Bus b2 = new Bus("Michael", 60, "Volvo");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("Number of buses created is "+Bus.getCount());
        
        String driversName  = BusDepot.getDriver();
        String make         = getMake();
        int numberOfSeats   = getNumberOfSeats();
        
        Bus b3 = new Bus(driversName,numberOfSeats, make);
        System.out.println(b3);
        System.out.println("Number of buses created is "+Bus.getCount());

    }
    public static String getDriver(){
        System.out.print("Enter drivers name: ");
        String name = sc.next();
        return name;
    }
    public static String getMake(){
        System.out.print("Enter make: ");
        return sc.next();
    }
    public static int getNumberOfSeats(){
        System.out.print("Enter number of seats: ");
        int seats = sc.nextInt();
        return seats;
    }
}
