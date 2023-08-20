import java.util.ArrayList;
import java.util.Scanner;

class Customer{
	private int custID;
	private String name;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
		custID=0;
		name="";
	}
	public Customer(int custID, String name) {
		super();
		this.custID = custID;
		this.name = name;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", name=" + name + "]";
	}
	
	
}

class Person{
	private int age;
	private String name, address;
		
	public Person(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address
				+ "]";
	}
	
}

public class ArrayListSample {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayListPerson();
//		String name = arrayListStringLiterals();
//		System.out.println(name);
//		arrayListInteger();
		processCustomers();
	}
	public static void processCustomers(){
		ArrayList<Customer> customers = new ArrayList<>();
		// add a customer
		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter customer id --> ");
			int custID = sc.nextInt();
			System.out.print("Enter customer name --> ");
			String name = sc.next();

			Customer customer = new Customer(custID, name);
			customers.add(customer);

			System.out.print("Continue (y/n) --> ");
			choice = sc.next();
		}
		System.out.println("After add:"+customers);
		
		// find
		// get the custID to find
		System.out.print("Enter the customer ID you wish to find --> ");
		int custID = sc.nextInt();
		boolean foundCustomer=false;
		for(Customer customer:customers){
			if(customer.getCustID() == custID){
				foundCustomer=true;
				System.out.println("Customer found..."+customer);
				customers.remove(customer);
				System.out.println("Customer deleted..."+customer);
				break;
			}
		}
		if(!foundCustomer){
			System.out.println("Customer not found..."+custID);
		}
		System.out.println("After find/delete:"+customers);
	}
	public static String arrayListStringLiterals(){
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zoe");
		names.add("Paul");
		names.add("Paul");
		names.add("Alan");
		names.add("Thomas");
		System.out.println(names);// output in the order they were added
		
		return names.get(4);
	}
	public static void arrayListStringsNoLoops(){
		// ArrayList declared using generic syntax (typed collection Java 1.5)
		// Also using type inference (the diamond operator Java 1.7) 
		ArrayList<String> names = new ArrayList<>();
		System.out.print("Enter a name to be added --> ");
		String name=sc.next();
		names.add(name);
		System.out.print("Enter a name to be added --> ");
		name=sc.next();
		names.add(name);
		System.out.print("Enter a name to be added --> ");
		name=sc.next();
		names.add(name);
		System.out.print("Enter a name to be added --> ");
		name=sc.next();
		names.add(name);
		
		System.out.println(names);// output in the order they were added
	}
	public static void arrayListStringsWithLoops(){
		ArrayList<String> names = new ArrayList<>();// generic and type inference
		System.out.print("Enter a name to be added ('x' to exit) --> ");
		String name=sc.next();
		while(!name.equalsIgnoreCase("x")){
			names.add(name);
			System.out.print("Enter a name to be added ('x' to exit) --> ");
			name=sc.next();			
		}
		
		System.out.println(names);// output in the order they were added
		
		// Output using  a for-each loop
		for(String somename:names)
			System.out.println("The name is "+somename);
	}
	public static void arrayListInteger(){
		// create an initial list of 3
		ArrayList<Integer> numbers = new ArrayList<Integer>(3);
		System.out.print("Enter an integer to be added (-1 to exit) --> ");
		int number=sc.nextInt();
		// the program does not crash if I go beyond the bounds of the ArrayList
		while(number != -1){
			numbers.add(number);	// autoboxing (Java 1.5); int -> Integer
									// sc.nextInt() returns an 'int'
			System.out.print("Enter an integer to be added (-1 to exit) --> ");
			number=sc.nextInt();			
		}
		
		System.out.println(numbers);// output in the order they were added
		
		// Output using  a for-each loop
		for(Integer num:numbers)
			System.out.println("The number is "+num);	// leave 'number' here and you get -1
		
		// autoboxing (Java 1.5); Integer -> int
		for(int num:numbers)
			System.out.println("The number is "+num);	
	}
	public static void arrayListPerson(){
		ArrayList<Person> people = new ArrayList<>(); // default size of 10
		while(true){
			System.out.print("Enter name --> ");
			String name = sc.next();
			System.out.print("Enter address --> ");
			String address = sc.next();
			System.out.print("Enter age --> ");
			int age = sc.nextInt();
			Person p = new Person(age, name, address);
			people.add(p);
			System.out.print("Do you wish to create more people (y/n) --> ");
			String userChoice=sc.next();
			if(userChoice.equalsIgnoreCase("n"))
				break; // exits
		}
		
		System.out.println(people);// output in the order they were added
		
		// Output using  a for-each loop
		for(Person person:people)
			System.out.println(person);	
	}

}
