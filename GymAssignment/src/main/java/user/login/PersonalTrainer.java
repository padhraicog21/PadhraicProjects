/*
 * CSE Team Project 2023
 * Team Members: Danjie Hu, Padhraic Gorham, Preety Kumari, Sikuka Maguire, Tadhg Lalor, Winnie Kennedy Aigbedion
 * Program Author: Tadhg Lalor
 * Program Function: Personal Trainer
 * Date: 11/08/23
 * Description/Notes: Credit to @Danjie for reminding me of Super() to inherit the parent class properties - Tadhg
 * */
package user.login;

public class PersonalTrainer extends User {
	
	public PersonalTrainer(){
		super();
	}
	
	public PersonalTrainer(String fName, String lName, String town, String eirCode, String emailAddr, String userName, String password, int userAge) {
		super(fName, lName, town, eirCode, emailAddr, userName, password, userAge);
	}
}
