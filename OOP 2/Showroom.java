package oop;

import java.util.Scanner;

class Car {

    private String theMake, theModel, theColour;
    private double theEngineSize;
    private boolean automatic;
    
    private static int count; // by default inited to 0

    Car() {
        count++;
    }

    Car(String theMake, String aModel, double aEngineSize, boolean aAutomatic, String aColour) {
        this.theMake    = theMake;
        theModel        = aModel;
        theEngineSize   = aEngineSize;
        automatic       = aAutomatic;
        theColour       = aColour;
        count++;
    }
    public String getColour() {
        return theColour;
    }

    public void setColour(String aColour) {
        theColour       = aColour;
    }
    
    public boolean isAutomatic(){
        return automatic;
    }
    public void setAutomatic(boolean aAutomatic){
        automatic       = aAutomatic;
    }

    public String getMake() {
        return theMake;
    }

    public void setMake(String theMake) {
        this.theMake = theMake;
    }

    public String getModel() {
        return theModel;
    }

    public void setModel(String aModel) {
        this.theModel = aModel;
    }

    public double getEngineSize() {
        return theEngineSize;
    }

    public void setEngineSize(double aEngineSize) {
        theEngineSize = aEngineSize;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Car details : " + theMake + " " + theModel 
                + " " + theEngineSize + " " + theColour + " "+automatic;
    }
}

public class Showroom {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //1.
        Car ford = new Car();

        //2.
        ford.setMake("Ford");
        ford.setModel("Mondeo");
        ford.setEngineSize(1.6);
        ford.setColour("Black");
        ford.setAutomatic(true);
        System.out.println(ford);

        //3.
        Car vw = new Car("VW", "Passat", 2.0, false, "Silver");
        System.out.println(vw);

        //4.
        System.out.println("count is " + Car.getCount());

        //5.
        String makeOfCar    = getMake();
        String model        = getModel();
        double engineSize   = getEngineSize();
        boolean automatic   = isAutomatic();
        String colour       = getColour();
        
        //6. Done above.
        
        //7. Done below.
        
        //8.
//      Car(String theMake, String aModel, double aEngineSize, boolean aAutomatic, String aColour) {
        Car usersCar = new Car(makeOfCar, model, engineSize, automatic, colour);

        //8a.
        System.out.println(usersCar);
        
        //8b.
        System.out.println("count is " + Car.getCount());
        
    }// end main method
    
    public static boolean isAutomatic(){
        System.out.print("Is it automatic (true/false) ?: ");
        return sc.nextBoolean();
    }
    public static String getColour() {
        System.out.print("Enter colour of car: ");
        String colour = sc.next();
        return colour;
    }

    public static String getMake() {
        System.out.print("Enter make of car: ");
        String make = sc.next();
        return make;
    }
    public static String getModel() {
        System.out.print("Enter model of car: ");
        return sc.next();
    }
    public static double getEngineSize() {
        System.out.print("Enter engine size: ");
        return sc.nextDouble();
    }

}// end of class
