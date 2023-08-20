package oop;

class MotorCar {

    private String theCarModel, theCarType;
    private int theAgeOfCar;

//		MotorCar bmw = new MotorCar("325", "BMW", 1);
    MotorCar(String aCarModel, String aCarType, int aAgeOfCar) {
        theCarModel = aCarModel;
        theCarType = aCarType;
        theAgeOfCar = aAgeOfCar;
    }

    public String getCarModel() {
        return theCarModel;
    }

    public void setCarModel(String aCarModel) {
        theCarModel = aCarModel;
    }

    public String getCarType() {
        return theCarType;
    }

    public void setCarType(String aCarType) {
        theCarType = aCarType;
    }

    public int getAgeOfCar() {
        return theAgeOfCar;
    }

    public void setAgeOfCar(int aAgeOfCar) {
        theAgeOfCar = aAgeOfCar;
    }

    @Override
    public String toString() {
        return "MotorCar [carModel=" + theCarModel + ", carType=" + theCarType
                + ", ageOfCar=" + theAgeOfCar + "]";
    }

}

class Driver {

    private String theName, theAddress;
    private boolean drinkDrivingOffence, caughtWithoutASeatbelt;
    private boolean dangerousOvertaking, usingMobileWhileDriving;
    private boolean drivingDefectiveVehicle, crossingContinuousWhiteline;
    private MotorCar theCar;
    private int theTotalPenaltyPoints;

// new Driver(  "John Civil", "someplace nice", volvo);
    Driver(String aName, String aAddress, MotorCar aCar) {
        theName = aName;
        theAddress = aAddress;
        theCar = aCar;
    }

    Driver(String aName, String aAddress,
            boolean drinkDrivingOffence,
            boolean caughtWithoutASeatbelt,
            boolean dangerousOvertaking,
            boolean usingMobileWhileDriving,
            boolean drivingDefectiveVehicle,
            boolean crossingContinuousWhiteline,
            MotorCar aCar) {
        theName = aName;
        theAddress = aAddress;
        this.drinkDrivingOffence = drinkDrivingOffence;
        this.caughtWithoutASeatbelt = caughtWithoutASeatbelt;
        this.dangerousOvertaking = dangerousOvertaking;
        this.usingMobileWhileDriving = usingMobileWhileDriving;
        this.drivingDefectiveVehicle = drivingDefectiveVehicle;
        this.crossingContinuousWhiteline = crossingContinuousWhiteline;
        theCar = aCar;
    }

    public int getTotalPenaltyPoints() {
        return theTotalPenaltyPoints;
    }

    private void setTotalPenaltyPoints(int aTotalPenaltyPoints) {
        theTotalPenaltyPoints = aTotalPenaltyPoints;
    }

    public String getName() {
        return theName;
    }

    public void setName(String aName) {
        theName = aName;
    }

    public String getAddress() {
        return theAddress;
    }

    public void setAddress(String aAddress) {
        theAddress = aAddress;
    }

    public boolean isDrinkDrivingOffence() {
        return drinkDrivingOffence;
    }

    public void setDrinkDrivingOffence(boolean drinkDrivingOffence) {
        this.drinkDrivingOffence = drinkDrivingOffence;
    }

    public boolean isCaughtWithoutASeatbelt() {
        return caughtWithoutASeatbelt;
    }

    public void setCaughtWithoutASeatbelt(boolean caughtWithoutASeatbelt) {
        this.caughtWithoutASeatbelt = caughtWithoutASeatbelt;
    }

    public boolean isDangerousOvertaking() {
        return dangerousOvertaking;
    }

    public void setDangerousOvertaking(boolean dangerousOvertaking) {
        this.dangerousOvertaking = dangerousOvertaking;
    }

    public boolean isUsingMobileWhileDriving() {
        return usingMobileWhileDriving;
    }

    public void setUsingMobileWhileDriving(boolean usingMobileWhileDriving) {
        this.usingMobileWhileDriving = usingMobileWhileDriving;
    }

    public boolean isDrivingDefectiveVehicle() {
        return drivingDefectiveVehicle;
    }

    public void setDrivingDefectiveVehicle(boolean drivingDefectiveVehicle) {
        this.drivingDefectiveVehicle = drivingDefectiveVehicle;
    }

    public boolean isCrossingContinuousWhiteline() {
        return crossingContinuousWhiteline;
    }

    public void setCrossingContinuousWhiteline(boolean crossingContinuousWhiteline) {
        this.crossingContinuousWhiteline = crossingContinuousWhiteline;
    }

    public MotorCar getCar() {
        return theCar;
    }

    public void setCar(MotorCar aCar) {
        theCar = aCar;
    }

    @Override
    public String toString() {
        return "Driver [name=" + getName() + ", address=" + getAddress()
                + ", drinkDrivingOffence=" + isDrinkDrivingOffence()
                + ", caughtWithoutASeatbelt=" + isCaughtWithoutASeatbelt()
                + ", dangerousOvertaking=" + isDangerousOvertaking()
                + ", usingMobileWhileDriving=" + isUsingMobileWhileDriving()
                + ", drivingDefectiveVehicle=" + isDrivingDefectiveVehicle()
                + ", crossingContinuousWhiteline="
                + isCrossingContinuousWhiteline() + ", car=" + theCar
                + ", totalPenaltyPoints=" + getTotalPenaltyPoints() + "]";
    }

    public void calculatePenaltyPoints() {
        int total = 0;
        if (isDrinkDrivingOffence()) {
            total += 5;
        }
        if (isCaughtWithoutASeatbelt()) {
            total += 5;
        }
        if (isDangerousOvertaking()) {
            total += 5;
        }
        if (isUsingMobileWhileDriving()) {
            total += 4;
        }
        if (isDrivingDefectiveVehicle()) {
            total += 5;
        }
        if (isCrossingContinuousWhiteline()) {
            total += 4;
        }
        // single point of responsibility i.e. dont set the instance variable
        // here; use the "set" method for that
        setTotalPenaltyPoints(total);
    }

    public boolean isDisqualified() {
        final int DISQUALIFIED_MIN = 12;

        if (getTotalPenaltyPoints() >= DISQUALIFIED_MIN) {
            return true;
        } else {
            return false;
        }
    }
}

public class CarEx {

    public static void main(String[] args) {
        MotorCar bmw = new MotorCar("325", "BMW", 1);
        Driver joeGouger = new Driver(
                "Joe Gouger",
                "someplace dodgy",
                true, true,
                false, true,
                false, true, bmw);
        System.out.println(joeGouger);

        joeGouger.calculatePenaltyPoints();
        System.out.println(joeGouger.getName() + " has " + joeGouger.getTotalPenaltyPoints() + " points");

        joeGouger.setDrivingDefectiveVehicle(true);
        joeGouger.calculatePenaltyPoints();
        System.out.println(joeGouger.getName() + " has " + joeGouger.getTotalPenaltyPoints() + " points");

        if (joeGouger.isDisqualified()) {
            System.out.println(joeGouger.getName() + " is disqualified ");
        } else {
            System.out.println(joeGouger.getName() + " is not disqualified ");
        }

        // John Civil
        MotorCar volvo = new MotorCar("S40", "Volvo", 4);
        Driver johnCivil = new Driver(
                "John Civil",
                "someplace nice",
                volvo);
        System.out.println(johnCivil);

        johnCivil.calculatePenaltyPoints();
        System.out.println(johnCivil.getName() + " has " + johnCivil.getTotalPenaltyPoints() + " points");

        johnCivil.setUsingMobileWhileDriving(true);
        johnCivil.calculatePenaltyPoints();
        System.out.println(johnCivil.getName() + " has " + johnCivil.getTotalPenaltyPoints() + " points");
        if (johnCivil.isDisqualified()) {
            System.out.println(johnCivil.getName() + " is disqualified ");
        } else {
            System.out.println(johnCivil.getName() + " is not disqualified ");
        }
    }
}
