package com.cse.array_lists;
// Sean Kennedy

import java.util.ArrayList;
import java.util.Scanner;

class PreOwnedCar {

	private String make, model, regNo;

	PreOwnedCar(String make, String model, String regNo) {
		this.make = make;
		this.model = model;
		this.regNo = regNo;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	@Override
	public String toString() {
		return "PreOwnedCar [make=" + make + ", model=" + model + ", regNo=" + regNo + "]";
	}

}

/*
 * public class Garage {
 * 
 * private static Scanner sc = new Scanner(System.in);
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * // final int ADD = 1, UPDATE=2, DELETE_ONE=3, DELETE_ALL=4,
 * FIND_CAR_REG_NO=5, FIND_CAR_INDEX=6, DISPLAY=7, EXIT=8; // final int ADD = 1,
 * UPDATE=2, DELETE_ONE=3, DELETE_ALL=4, FIND_CAR_BY_INDEX=5, DISPLAY=6, EXIT=7;
 * final int ADD = 1, SOLD_CAR = 2, DELETE_ONE = 3, EXIT = 4; String
 * userContinue = "y"; ArrayList<PreOwnedCar> preOwnedCars = new ArrayList<>();
 * // java 1.7 // The AL must not have class scope or scope of all the methods
 * i.e. declare it locally to main(). // ArrayList<PreOwnedCar> preOwnedCars =
 * new ArrayList<PreOwnedCar>();
 * 
 * System.out.println("Pre-owned Car Sales"); while
 * (userContinue.equalsIgnoreCase("y")) { switch (userChoice()) { case ADD:
 * add(preOwnedCars); break; case SOLD_CAR: soldCar(preOwnedCars); break; case
 * DELETE_ONE: deleteOneCar(preOwnedCars); break; // case FIND_CARS_BY_MAKE:
 * findCarsByMake(preOwnedCars);break; // case DISPLAY:
 * display(preOwnedCars);break; case EXIT: userContinue = "n"; break; default:
 * System.out.println("Unknown entry : "); break; // case DELETE_ALL:
 * deleteAllCars(preOwnedCars);break; // case FIND_CAR_REG_NO:
 * findCarByRegNo(preOwnedCars);break; // method is coded below // case
 * FIND_CAR_BY_INDEX: findCarByIndex(preOwnedCars);break; } } }
 * 
 * 
 * public static int userChoice() { int choice = 0;
 * 
 * System.out.println("What do you want to do ?"); System.out.println("1. Add");
 * System.out.println("2. Sold a car"); System.out.println("3. Delete a car");
 * System.out.println("4. Exit");
 * 
 * return sc.nextInt(); }
 * 
 * public static void add(ArrayList<PreOwnedCar> cars) {
 * System.out.println("BEFORE : " + cars); // Get the reg number
 * System.out.print("Enter the reg number --> "); String regNo = sc.next();
 * 
 * // If the car reg no is not in AL then add car if (doesCarExist(regNo, cars)
 * >= 0) { // found System.out.println("The car with reg no " + regNo +
 * " is already in the list..."); } else {
 * System.out.print("Enter the make --> "); String make = sc.next();
 * System.out.print("Enter the model --> "); String model = sc.next();
 * System.out.print("Enter the owner --> "); String owner = sc.next();
 * System.out.print("Enter the age --> "); int age = sc.nextInt(); PreOwnedCar
 * car = new PreOwnedCar(make, model, regNo, owner, age); cars.add(car);
 * System.out.println("AFTER : " + cars); } }
 * 
 * public static int doesCarExist(String carRegNo, ArrayList<PreOwnedCar> cars)
 * { int index = -1; for (int i = 0; i < cars.size(); i++) { PreOwnedCar car =
 * cars.get(i); if (car.getRegNo().equalsIgnoreCase(carRegNo)) { index = i;
 * break; } } return index; } public static void soldCar(ArrayList<PreOwnedCar>
 * cars) { System.out.println("BEFORE : " + cars);
 * System.out.print("Enter the registration number of the car sold --> ");
 * String carRegNo = sc.next();
 * 
 * int index = doesCarExist(carRegNo, cars); // Only update if the car is
 * already in the list... if (index == -1) { // not found
 * System.out.println(carRegNo + " is not in the list..."); } else { // Get the
 * current Person from the AL PreOwnedCar car = cars.get(index);
 * System.out.print("Enter the new owner --> "); car.setOwner(sc.next());
 * cars.set(index, car); // update AL at specific index with updated car.
 * System.out.println("AFTER : " + cars); } } public static void
 * deleteOneCar(ArrayList<PreOwnedCar> cars) { System.out.println("BEFORE : " +
 * cars);
 * 
 * System.out.print("Enter the reg number --> "); String carRegNo = sc.next();
 * int index = doesCarExist(carRegNo, cars); if (index == -1) { // not found
 * System.out.
 * println("Could not find that reg number so could not delete that car!"); }
 * else { System.out.println("Deleted car..."); cars.remove(index);
 * System.out.println("AFTER : " + cars); } } }
 */
public class Garage {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ADD = 1, UPDATE = 2, DELETE_ONE_CAR = 3, HOW_MANY_OF_MAKE = 4, EXIT = 5;
		String userContinue = "y";
		ArrayList<PreOwnedCar> preOwnedCars = new ArrayList<>(); // java 1.7
		// The AL must not have class scope or scope of all the methods i.e. declare it
		// locally to main().
//		ArrayList<PreOwnedCar> preOwnedCars = new ArrayList<PreOwnedCar>();

		System.out.println("Second hand car program");
		while (userContinue.equalsIgnoreCase("y")) {
			switch (userChoice()) {
				case ADD:
					add(preOwnedCars);
					break;
				case UPDATE:
					update(preOwnedCars);
					break;
				case DELETE_ONE_CAR:
					deleteCar(preOwnedCars);
					break;
				case HOW_MANY_OF_MAKE:
					howManyOfMake(preOwnedCars);
					break;
				case EXIT:
					userContinue = "n";
					break;
				default:
					System.out.println("Unknown entry : ");
					break;
			}
		}
	}

	public static int userChoice() {
		System.out.println("What do you want to do ?");
		System.out.println("1. Add");
		System.out.println("2. Update");
		System.out.println("3. Delete a car");
		System.out.println("4. How many of a certain make? ");
		System.out.println("5. Exit");
		return sc.nextInt();
	}

	// 1. Add
	public static void add(ArrayList<PreOwnedCar> carsAL) {
		// Get the reg number
		System.out.print("Enter the reg number --> ");
		String carRegNo = sc.next();

		// If the car reg no is not in AL then add car
		int index = carThereAlready(carRegNo, carsAL);
		if (index >= 0) {
			System.out.println("The car with reg no " + carRegNo + " is already in the list...");
		} else {
			System.out.print("Enter the make --> ");
			String carMake = sc.next();
			System.out.print("Enter the model --> ");
			String carModel = sc.next();
			PreOwnedCar car = new PreOwnedCar(carMake, carModel, carRegNo);
			carsAL.add(car);
			for (PreOwnedCar preOwnedCar : carsAL) {
				System.out.println(preOwnedCar);
			}
		}
	}

	public static int carThereAlready(String carRegNo, ArrayList<PreOwnedCar> carsAL) {
//        int index = -1;
//        for (int i = 0; i < carsAL.size(); i++) {
//            PreOwnedCar car = carsAL.get(i);
//            if (car.getRegNo().equalsIgnoreCase(carRegNo)) {
//                index = i;
//                break;
//            }
//        }
//        return index;
		int index = -1;
		for (PreOwnedCar car : carsAL) {
			if (car.getRegNo().equalsIgnoreCase(carRegNo)) {
				index = carsAL.indexOf(car);
				break;
			}
		}
		return index;

	}

	// 2. Update
	public static void update(ArrayList<PreOwnedCar> carsAL) {
		final int MAX_FEATURES = 3;

		for (PreOwnedCar preOwnedCar : carsAL) {
			System.out.println(preOwnedCar);
		}
		System.out.print("Enter the index of the car you wish to update --> ");

		int index = sc.nextInt();
		if (index < 0 || index >= carsAL.size()) {
			System.out.println("Index entered is invalid:  " + index);
		} else {
			PreOwnedCar car = carsAL.get(index);
			// Now get the detail(s) to be changed
			exitForLoop: for (int i = 1; i <= MAX_FEATURES; i++) {
				System.out
						.print("Enter the feature you to update: (M)ake M(o)del (R)eg. Any other key to exit... --> ");
				String feature = sc.next().toUpperCase();
				switch (feature) {
					case "M":
						System.out.print("Enter the new make --> ");
						car.setMake(sc.next());
						break;
					case "O":
						System.out.print("Enter the new model --> ");
						car.setModel(sc.next());
						break;
					case "R":
						System.out.print("Enter the new reg number --> ");
						car.setRegNo(sc.next());
						break;
					default:
						break exitForLoop; // finished
				}

			}
			// maybe this is unnecessary - I get a reference to it and therefore
			// any changes using that reference affect the AL - it works!
			// carsAL.set(index, car); // update AL at specific index with updated car.
			for (PreOwnedCar preOwnedCar : carsAL) {
				System.out.println(preOwnedCar);
			}

		}

	}

	// 3. Delete a car
	public static void deleteCar(ArrayList<PreOwnedCar> carsAL) {
		final int NOT_FOUND = -1;
		for (PreOwnedCar preOwnedCar : carsAL) {
			System.out.println(preOwnedCar);
		}

		System.out.print("Enter the reg number --> ");
		String carRegNo = sc.next();
		int index = carThereAlready(carRegNo, carsAL);
		if (index == NOT_FOUND) {
			System.out.println("Could not find reg number: " + carRegNo + " so could not delete that car!");
		} else {
			System.out.println("Deleting car...");
			carsAL.remove(index);
			for (PreOwnedCar preOwnedCar : carsAL) {
				System.out.println(preOwnedCar);
			}
		}
	}

	// 4. How many of a certain model?
	public static void howManyOfMake(ArrayList<PreOwnedCar> carsAL) {
		System.out.print("Enter the make --> ");
		String carMake = sc.next();
		int count = 0;

		for (PreOwnedCar car : carsAL) {
			if (car.getMake().equalsIgnoreCase(carMake)) {
				count++;
			}
		}
		System.out.println("Number of " + carMake + "'s is " + count);
	}

	// Extra
	public static void deleteAllCars(ArrayList<PreOwnedCar> carsAL) {
		carsAL.clear();
		if (carsAL.isEmpty()) {
			System.out.println("The array list is blank");
		}
	}

	// Extra
	public static void findCarByIndex(ArrayList<PreOwnedCar> carsAL) {
		System.out.print("Enter the index --> ");
		int index = sc.nextInt();
		if (index < 0 || index >= carsAL.size()) {
			System.out.println("The index is out of bounds : " + index);
		} else {
			// index ok
			PreOwnedCar car = carsAL.get(index);
			System.out.println(car);
		}
	}

	// Extra
	public static void display(ArrayList<PreOwnedCar> carsAL) {
//		System.out.println("The cars list : "+carsAL);
		for (PreOwnedCar car : carsAL) {
			System.out.println(car);
		}

		// Convert to an array
		// See http://viralpatel.net/blogs/convert-arraylist-to-arrays-in-java/
//		PreOwnedCar[] carArray = carsAL.toArray(new PreOwnedCar[carsAL.size()]);
//		for(int i=0; i<carArray.length; i++){
//			System.out.println("PreOwnedCar ["+i+"] is "+carArray[i]);
//		}
	}

}
