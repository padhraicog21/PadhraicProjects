/*
 * CSE Team Project 2023
 * Team Members: Danjie Hu, Padhraic Gorham, Preety Kumari, Sikuka Maguire, Tadhg Lalor, Winnie Kennedy Aigbedion
 * Program Author: Tadhg Lalor
 * Program Function: Creates a user object that has various variables assigned to it which give us information about the User.
 * Description/Notes:
 * */
//import java.util.*; //Import all from the Utilities package.
package user.login;

public class User {

	// Encapsulated Variables
	private String firstName;
	private String lastName;
	private String town;
	private String eirCode;
	private String emailAddress;
	private String username;
	private String password;
	private int age; // To be determined vs D.O.B. - Date of Birth might be a little complex with date object
					
	private boolean isLoggedIn;
	private boolean canEdit;
	static int count;

	public User() { // Default Constructor
		count++;
	}

	// Overloaded Constructor which will create a user object with various
	// parameters such as name, age, email address, etc.
	public User(String fName, String lName, String town, String eirCode, String emailAddr, String userName, String password, int userAge) {
		this.firstName = fName;
		this.lastName = lName;
		this.town=town;
		this.eirCode = eirCode;
		this.emailAddress = emailAddr;
		this.username = userName;
		this.password = password;
		this.age = userAge;
		count++;
	}

	// Retrieves the first name of the User Object.
	public String getFirstName() {
		return firstName;
	}

	// Sets the first name of the User object.
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Retrieves the last name of the User Object.
	public String getLastName() {
		return lastName;
	}

	// Sets the last name of the User object.
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Retrieves the town of the User Object.
	public String getTown() {
		return town;
	}

	// Sets the town of the User object.
	public void setTown(String town) {
		this.town = town;
	}

	// Retrieves the eirCode of the User Object.
	public String getEirCode() {
		return eirCode;
	}

	// Sets the eircode of the User object.
	public void setEirCode(String eirCode) {
		this.eirCode = eirCode;
	}

	// Retrieves the email address of the User Object.
	public String getEmailAddress() {
		return emailAddress;
	}

	// Sets the email address of the User object.
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	// Retrieves the username of the User Object.
	public String getUsername() {
		return username;
	}

	// Sets the username of the User object.
	public void setUsername(String username) {
		this.username = username;
	}

	// Retrieves the password of the User Object.
	public String getPassword() {
		return password;
	}

	// Sets the password of the User object.
	public void setPassword(String password) {
		this.password = password;
	}

	// Retrieves the age of the User Object.
	public int getAge() {
		return age;
	}

	// Sets the Age of the User object. @param age
	public void setAge(int age) {
		this.age = age;
	}

	public boolean CanEdit() {
		return canEdit;
	}

	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}

	// ToString override
	@Override
	public String toString() {

		return "First Name:\t" + this.firstName + "\nLast Name:\t" + this.lastName + "\nTown:\t" + this.town
				+ "\nEirCode:\t" + this.eirCode + "\nEmail Address:\t" + this.emailAddress + "\nUsername:\t" + this.username
				+ "\nPassword:\t" + this.password + "\nAge:\t" + this.age + "\n";
	}
	
	//Can't be tested, as Junit tests out of order randomly so the number of user objects increases randomly I think - Tadhg
	public static int getCount() {
		return count;
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}
	
}
