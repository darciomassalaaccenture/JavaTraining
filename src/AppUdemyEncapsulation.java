public class AppUdemyEncapsulation {

    // With objects, you can group similar variables together
    // But also, you can group functions together too
    // to create a complex class
}

class BankCustomer {
    String name;
    String accountNumber;
    char accountType;
    double balance;
    int pin;

    // Here we created a function that can be called within this
    // class

    public boolean isGoodClient() {
        if (balance > 10000)
            return true;
        else
            return false;
    }
    // Here we created some getter and setter methods to return names
    // useful when we are dealing with variables holding immense info
    // If you keep the same convention, these can be used in
    // other java coding files

    // Why use them?
    // Encapsulation
    // Helps us keep internal data private and we can create
    // well created methods to access them.
    // In this case, as internal data changes, external methods
    // remain the same
    // In this case, there's no need to access attributes directly
    // like in lines 53-54, line 56.

    public String getName() {
        return name;
        // This returns a given name
    }

    public void setName(String n) {
        name = n; // sets the String name a value of n
    }

}

class TestBankCustomer {
    public static void main(String[] args) {
        BankCustomer darcio = new BankCustomer();

        darcio.name = "Darcio Massala";
        darcio.balance = 20000;

        if (darcio.isGoodClient())
            System.out.println("Darcio is a good client");
    }
}
