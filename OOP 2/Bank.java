package oop;


class Customer {

    private int accountNo;
    private double balance;
    private String name;
    private static int count;

    Customer() {
        accountNo = 0;
        balance = 0;
        name = "";
        count++;
    }

    Customer(String name, int accountNo, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
        count++;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public double lodge(double amt) {
        balance += amt; // balance = balance + amt;
        return balance;
    }

    public boolean withdraw(double amt) {
//        if (balance - amt >= 0) {
        if (balance >= amt) {
            System.out.println("Balance of " + balance + " is "
                    + "fine for a withdrawal of " + amt);
            balance -= amt; //balance = balance - amt;            
            System.out.println("New balance is " + balance );
            return true;
        } else {
            System.out.println("Balance of " + balance + " is "
                    + "too small for a withdrawal of " + amt);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Customer [accountNo=" + accountNo + ", balance=" + balance
                + ", name=" + name + "]";
    }

}

public class Bank {

    public static void main(String[] args) {
        // 1a.
        Customer joe = new Customer();
        joe.setName("joe bloggs");
        joe.setAccountNo(1221);
        joe.setBalance(100.0);
        System.out.println("Name is "+joe.getName());
        System.out.println("Account Number is "+joe.getAccountNo());
        System.out.println("Balance is "+joe.getBalance());

        // 1b.
        Customer ann = new Customer("ann bloggs", 4443, 200.0);
        System.out.println("ann = " + ann);

        // 1c.
        System.out.println("Number of customers = " + Customer.getCount());

        // 2.
        joe.setName("Joseph Bloggs"); 
        System.out.println("joe = " + joe);
        
        // 3.
        System.out.println(ann.withdraw(250.0)); // false
        double newBalance = ann.lodge(100.0);
        System.out.println("New balance after lodgment is: "+newBalance); // 300.0
        //try again...
        System.out.println(ann.withdraw(250.0)); // true
        System.out.println("ann = " + ann); // 50.0

//        System.out.println("Joe: lodging 100: " + joe.lodge(100));
//        System.out.println("Joe: withdrawing 50: " + joe.withdraw(50));
//        System.out.println("Joe: withdrawing 500: " + joe.withdraw(500));
//        Customer ann = new Customer(3421, 200, "Ann Bloggs");
//        System.out.println("ann = " + ann);
//		ann.setBalance(300);
//		System.out.println("ann's balance = "+ann.getBalance());
    }

}
