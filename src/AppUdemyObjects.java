// variables hold infomration.
// usually each class has many variables.

public class AppUdemyObjects {

}

class Customer {
    String name;
    String accontNumber;
    char accountType;
    double balance;
    int pin;
}
// all these variables make up one customer

// Let's create a programme that uses our defined
// class above
class TestCustomer {
    public static void main(String[] args) {
        // let's create a new object
        Customer bob = new Customer();
        // Customer is a template
        // bob and jane are objects
        Customer jane = new Customer();

        // Once an object has been created or instantiated
        // you can access its individual components

        bob.name = "Bob Mirsana"; // String name of bob
        bob.accountType = 'S'; // Account type of bob

        jane.name = "Jane Sandfield";
        jane.accountType = 'S';

        // if (bob.accountType == 'C')
        // System.out.println("Bob's account: Checking");
        // if (bob.accountType == 'S')
        // System.out.println("Bob's account : Saving");
        // else
        // ;
    }
}

// Each class is a seperate entity