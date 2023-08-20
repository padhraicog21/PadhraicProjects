package oop;

class Person  {

    private int age;// instance variable
    private String name, address;// instance variable
    private static int count; // class variable

    // new Person(22, "John", "Dublin")
    Person(int age, String name, String addressOfPerson) {
        setAge(age);
    	//this.age = age;
        this.name    = name;
        address = addressOfPerson;
        count++;
    }

    public static int getCount() {// class method
//    	this.age = 99;
        return count;
    }

    public int getAge() { // instance method
//    	this.age = 99;
        return age;
    }

    public void setAge(int age) {
        if(age < 0 ){ // bad value
            System.err.println("Invalid age: "+age);
        }else{
            this.age = age;        
        }
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
        return "age=" + age + ", name=" + name + 
                ", address=" + address ;
    }
}

public class Family {
    public static void main(String[] args) {
    	// 1.
// Person(int age, String name, String address) {
    	
        Person john = new Person(22, "John", "Dublin");
        Person ann  = new Person(25, "Ann", "Galway");
        Person jack = new Person(15, "Jack", "Athlone");
        int age = john.getAge();
        age = ann.getAge();
        age = jack.getAge();
        
        System.out.println("The number of objects created is : " 
                + Person.getCount()); // className.staticMethod()
        
        // 2. John has moved to "Galway"
        john.setAddress("Wexford");
        System.out.println(john.getAddress()); // objReference.instanceMethod()
        System.out.println("John: "+ john.toString()); // explicit call
        System.out.println("John: "+ john); // implicit call
        
        // 3. Ann has celebrated her birthday
        ann.setAge(-2);
        System.out.println("Ann: "+ ann); // 25
        ann.setAge(26);
        System.out.println("Ann: "+ ann); // 26
        
        // 4. Jack has changed his name to "JJ"
        System.out.println("Jack: "+ jack.toString());
        jack.setName("JJ");
        System.out.println("Jack: "+ jack);
    	
    }

}
