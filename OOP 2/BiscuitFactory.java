package oop;

import java.util.Scanner;

class Biscuit{
    private int theNumberOfBiscuits;
    private String theTypeOfBiscuit;
    private String theCompany;
    private String theLocation;


    Biscuit() {
    }
    
    Biscuit(String aCompany, String aTypeOfBiscuit, int aNumberOfBiscuits, String aLocation) {
        theNumberOfBiscuits = aNumberOfBiscuits;
        theTypeOfBiscuit    = aTypeOfBiscuit;
        theCompany          = aCompany;
        theLocation         = aLocation;
    }

    public String getLocation() {
        return theLocation;
    }

    public void setLocation(String aLocation) {
        theLocation         = aLocation;
    }
    
    
    public int getNumberOfBiscuits() {
        return theNumberOfBiscuits;
    }

    public void setNumberOfBiscuits(int aNumberOfBiscuits) {
        theNumberOfBiscuits = aNumberOfBiscuits;
    }

    public String getTypeOfBiscuit() {
        return theTypeOfBiscuit;
    }

    public void setTypeOfBiscuit(String aTypeOfBiscuit) {
        theTypeOfBiscuit = aTypeOfBiscuit;
    }

    public String getCompany() {
        return theCompany;
    }

    public void setCompany(String aCompany) {
        theCompany = aCompany;
    }

    @Override
    public String toString() {
        return "Biscuit{" + "theNumberOfBiscuits=" 
                + theNumberOfBiscuits + ", theTypeOfBiscuit=" 
                + theTypeOfBiscuit + ", theCompany=" 
                + theCompany + ", theLocation="
                + theLocation + "}";
    }
    
    
}
public class BiscuitFactory {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 1,2
        Biscuit mcVities = new Biscuit();
        mcVities.setCompany("McVities");
        mcVities.setTypeOfBiscuit("Digestive");
        mcVities.setNumberOfBiscuits(20);
        // 5b
        mcVities.setLocation("Manchester");
        System.out.println(mcVities);
        
        // 3, 5c
        Biscuit kimberleys = new Biscuit("Kimberleys", "Mikado", 30, "Dublin");
        System.out.println(kimberleys);
        
        // 4
        String company      = getCompany();
        String biscuitType  = getTypeOfBiscuit();
        int numBiscuits     = getNumBiscuits();
        // 5a
     //   getLocation();
        BiscuitFactory bf   = new BiscuitFactory();// create an instance
        String location     = bf.getLocation();
        Biscuit userBiscuit = new Biscuit(company, biscuitType, numBiscuits, location);
        System.out.println(userBiscuit);
        
    }
    public static String getTypeOfBiscuit() {
        System.out.print("Enter type of biscuit: ");
        return sc.next();
    }
    public static String getCompany() {
        System.out.print("Enter company: ");
        return sc.next();
    }
    public String getLocation() { // instance method (non-static)
    	//this.toString();
        System.out.print("Enter location: ");
        return sc.next();
    }
    public static int getNumBiscuits() { // class method
        System.out.print("Enter number of biscuits: ");
        return sc.nextInt();
    }
    
}
