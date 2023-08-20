package sample_run;

// Sean Kennedy
import java.util.ArrayList;
import java.util.Scanner;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
	
}

public class ArrayListPeople {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int ADD = 1, UPDATE=2, DELETE_ONE=3, DELETE_ALL=4, FIND_CAR_REG_NO=5, FIND_CAR_INDEX=6, DISPLAY=7, EXIT=8;
		final int ADD = 1, UPDATE=2, DELETE_ONE=3, DELETE_ALL=4, FIND_PERSON_BY_INDEX=5, DISPLAY=6, EXIT=7;
		String userContinue="y";
		ArrayList<Person> people = new ArrayList<>(); // java 1.7
		// The AL must not have class scope or scope of all the methods i.e. declare it locally to main().
//		ArrayList<Person> people = new ArrayList<Person>();
		
		System.out.println("People Register");
		while(userContinue.equalsIgnoreCase("y")){
			switch(userChoice()){
				case ADD: 		add(people);break;
				case UPDATE: 		update(people);break;
				case DELETE_ONE: 	deletePerson(people);break;
				case DELETE_ALL: 	deleteEveryone(people);break;
//				case FIND_PERSON_BY_NAME: 	findPersonByName(people);break;	// method is coded below
				case FIND_PERSON_BY_INDEX:	findPersonByIndex(people);break;
				case DISPLAY: 		display(people);break;
				case EXIT: 		userContinue="n"; break;
				default: System.out.println("Unknown entry : "); break;
			}
		}	
        }
	public static int userChoice() {
		System.out.println("What do you want to do ?");
		System.out.println("1. Add");
		System.out.println("2. Update");
		System.out.println("3. Delete a person");
		System.out.println("4. Delete everyone");
		System.out.println("5. Find a person");
		System.out.println("6. Display");
		System.out.println("7. Exit");
		return sc.nextInt();
	}
        
	public static void add(ArrayList<Person> people) {
		// Get the persons name
		System.out.print("Enter the persons name --> ");
		String name = sc.next();

		// If the person name is not in AL then add person
		if(personThereAlready(name, people) >= 0){ // found
			System.out.println(name+" is already in the list...");
		}else{
			System.out.print("Enter the persons age --> ");
			int age = sc.nextInt();
			Person person = new Person(name, age);
			people.add(person);
		}
	}

	public static int personThereAlready(String name, ArrayList<Person> people) {
            int index=-1;
            for(int i=0; i<people.size(); i++){
                Person person = people.get(i);
                if(person.getName().equalsIgnoreCase(name)){
                    index = i;
                    break;
                }
            }
            return index;
	}
	public static void update(ArrayList<Person> people) {
            System.out.print("Enter the persons name you wich to change --> ");
            String name = sc.next();

            // If the person name is not in AL then add person
            int index = personThereAlready(name, people);
            if( index == -1){ // not found
                System.out.println(name+" is not in the list...");
            }else{
		// Get the current Person from the AL
		try{
                    Person person = people.get(index);
                    System.out.print("Enter the new name --> ");
                    person.setName(sc.next());
                    System.out.print("Enter the new age --> ");
                    person.setAge(sc.nextInt());
                    people.set(index, person);	// update AL at specific index with updated person.
                    System.out.println("The updated persons list : "+people);

		} catch(IndexOutOfBoundsException e){
                    System.out.print("IndexOutOfBoundsException caught..."); // don't print the stack trace
		}
            }
		
	}
	public static void deletePerson(ArrayList<Person> people) {
            System.out.println("The persons list before : "+people);

            System.out.print("Enter the persons name you wish to delete --> ");
            String name = sc.next();
            int index = personThereAlready(name, people);
            if( index == -1){ // not found
                System.out.println("Could not find that person!");
            }else{
                people.remove(index);
            }
            System.out.println("The persons list after : "+people);
	}
        
        public static void deleteEveryone(ArrayList<Person> people) {
            people.clear();
            if(people.isEmpty()){
                System.out.println("The array list is blank");
            }
	}
        
        public static void findPersonByIndex(ArrayList<Person> people) {
            System.out.print("Enter the index --> ");
            int index = sc.nextInt();
            if(index < 0 || index >= people.size()){
                System.out.println("The index is out of bounds : "+index);
            }else{
                // index ok
                Person person = people.get(index);
                System.out.println(person);
            }
	}

	public static void findPersonByName(ArrayList<Person> people) {
            // Get the reg number
            System.out.print("Enter the persons name --> ");
            String name = sc.next();
            boolean personFound=false;
            for(Person person:people){
                if(person.getName().equalsIgnoreCase(name)){
                    personFound=true;
                    break;
                }
            }				
            if(personFound){
                System.out.println("Found person...");
            }
            else{
                System.out.println("Did NOT find person!");
            }
	}

	public static void display(ArrayList<Person> people) {
//		System.out.println("The persons list : "+people);
            for(Person person:people)
                System.out.println(person);
		
		// Convert to an array
		// See http://viralpatel.net/blogs/convert-arraylist-to-arrays-in-java/
//		Person[] personArray = people.toArray(new Person[people.size()]);
//		for(int i=0; i<personArray.length; i++){
//			System.out.println("Person ["+i+"] is "+personArray[i]);
//		}
	}
	
}

