import java.util.Scanner;

public class TestScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name : ");
//		String name=sc.nextLine(); // works
		String name=sc.next(); 

		System.out.print("Enter address : ");
		String address=sc.nextLine();

		System.out.println("Name is "+name);
		System.out.print("Address is"+address); // no CR afterwards
		System.out.println("End...");
	}

}
/*

 * Run 1:
		Enter name : sean
		Enter address : Name is sean
		Address isEnd...

 * 
 * Why? 
 * 		next() reads the token 'sean'. When nextLine() is then executed, 
 * 		'<CR>'. This is why nextline() does not block; the CR is in the input buffer
 * 		and satisfies the nextLine() requirement. Note that the API states that 
 * 		nextLine() - "This method returns the rest of the current line, excluding any 
 * 		line separator at the end". Thus 'address' has nothing in it (no CR). This is 
 * 		why "End..." comes up right against the "Address is"... 
 
 * Run 2:
 		Enter name : john walsh
		Enter address : Name is john
		Address is walshEnd...

 * 
 * Why? 
 * 		The default delimiter when a Scanner object is setup is whitespace.
 * 		Therefore, next() reads a token delimited by a whitespace i.e. 'john'. When
 * 		the nextLine() is then executed, 'walsh' is read in as the address.  
 **
 *
 */
