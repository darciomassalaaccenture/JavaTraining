public class AppUdemyEncapsulation2 {

}

// The attributes below can be changed to
// public or private, as well as functions you add later
// This will change their visibiity

class BCustomer {
    private String name;
    String accountNumber;
    char accountType;
    double balance;
    int pin;

    // To create constructor*
    // Create a Method with the same name as the class
    // constructors must be public

    // constructor version 1 below

    // public BCustomer() {
    // name = null;
    // accountNumber = null;
    // accountType = 'X';
    // balance = 0.0;
    // pin = 0;
    // }

    // Also we can use parameters to inform constructor
    // which object attributes to initialise
    // once they've been instantiated

    // constructor version 2

    public BCustomer(String n, String a, char t, double b, int p) {
        name = n;
        accountNumber = a;
        accountType = t;
        balance = b;
        pin = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public boolean isGoodClient() {
        if (balance > 10000)
            return true;
        else
            return false;
    }
}

class TestBCustomer {
    public static void main(String[] args) {

        // With version 2 constructor
        // we don't need to set name and valur manually like below

        // BCustomer darcio = new BCustomer();
        // darcio.setName("Darcio Massala");
        // darcio.balance = 10000;

        // instead we set the values as parameters
        // when we instantiate the object darcio

        // make sure char uses single quotes eg. 'C'

        BCustomer darcio = new BCustomer("Darcio Massala", "020799", 'C', 12000, 1234);

        if (darcio.isGoodClient()) {
            System.out.println(darcio.getName() + " = good client");
        }

    }
}

// If we go back up we can initialise our variables (attributes)
// By using a constructor *
