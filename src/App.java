// If statements and Loops

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("It's me...");
    }
}

class VariableTest {
    public static void main(String[] args) throws Exception {
        int books = 4;
        int notepads = 2;
        float total = 20.0F;

        int totals = books + notepads;
        System.out.println(totals);
    }
}

class IfTest {
    public static void main(String[] args) {
        int age = 19;

        if (age < 18) {
            System.out.println("Too young");
        } else if (age > 21) {
            System.out.println("Too old");
        } else
            System.out.println("Yeah you're good");
    }
}

class switchTest {
    public static void main(String[] args) {
        char selection = 'a';
        switch (selection) {
            case 'a':
                System.out.println("a is selected");
                break;
            case 'b':
                System.out.println("b is selected");
                break;
            case 'c':
                System.out.println("c is selected");
                break;
            default:
                System.out.println("No value selected");
        }
    }
}

// Use when number of iterations are fixed
// or when you need to use indexing variable in loop

class ForTest {
    public static void main(String[] args) {
        int i, total = 0;

        for (i = 10; i > 0; i--) {
            // total = total + i;
            System.out.println(i);
        }

        System.out.println("Fire!");
    }
}

// Use While loops when the condition must be checked before
// Continuing with the function

// Best used when you don't know the number of iterations
// until a condition is met

class WhileTest {
    public static void main(String[] args) {
        int sum = 0;

        while (sum < 10) {
            sum++;
            System.out.println(sum);
        }
        System.out.println("Sum is: " + sum);
    }
}

// Use Do While loops when the statement needs to happen
// Once before being checked

class DoTest {
    public static void main(String[] args) {
        int sum = 0;

        do {
            sum++;
            System.out.println(sum);
        } while (sum < 10);
        {
            System.out.println("Sum is: " + sum);
        }

    }
}

// Break ends things early and move on to the next block
// Can be useful for conditions that are infinite

class BreakTest {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
            break;
        }
        System.out.println("The end");
    }
}

// Continue makes the next block stop iterating, once
// condition has been met.
// As observed below, function prints the statement 'Hello World'
// until if condition is met, then continue directs the code
// back to the top to print Hello another 5 times

class ContinueTest {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println(i + " Hello");
            if (i > 4) {
                continue;
            }
            System.out.println(i + " World");
        }
        System.out.println("The end");
    }
}