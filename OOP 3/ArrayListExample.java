import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	private static Scanner sc = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ADD = 1, UPDATE=2, DELETE=3, DISPLAY=4,EXIT=5;
		String userContinue="y";
		ArrayList<String> destinations = new ArrayList<>();
		
		System.out.println("Holiday destination program");
		while(userContinue.equalsIgnoreCase("y")){
			switch(userChoice()){
				case ADD: 		destinations.add(add());break;
				case UPDATE: 	update(destinations);break;
				case DELETE: 	delete(destinations);break;
				case DISPLAY: 	display(destinations);break;
				case EXIT: 		userContinue="n"; break;
				default: System.out.println("Unknown entry : "); break;
			}
		}
	}
	public static int userChoice() {
		System.out.println("What do you want to do ?");
		System.out.println("1. Add");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. Display");
		System.out.println("5. Exit");
		return sc.nextInt();
	}
	
	public static String add() {
		System.out.print("Enter a destination to add --> ");
		return sc.next();
	}
	public static void update(ArrayList<String> destAL) {
		System.out.println("The destinations currently are : "+destAL);
		System.out.print("Enter the index you wish to update --> ");
		int index = sc.nextInt();
		System.out.print("Enter a destination to add --> ");
		String newDest = sc.next();
		destAL.set(index, newDest);
		System.out.println("The destinations now are : "+destAL);
	}
	public static void delete(ArrayList<String> destAL) {
		System.out.println("The destinations currently are : "+destAL);
		System.out.print("Enter the index you wish to delete --> ");
		int index = sc.nextInt();
		destAL.remove(index);
		System.out.println("The destinations now are : "+destAL);
	}
	public static void display(ArrayList<String> destAL) {
		System.out.println("The destinations currently are : "+destAL);
		for(String dest:destAL)
			System.out.println(dest);
	}
}
