// A method is a group of statemets put together to perform
// a specific task

// Where variables hold data
// methosd do work on data

public class AppUdemyMethods {
    public static void main(String[] args) {
        System.out.println("We All Love");
        fancyPrint();

        System.out.println("It's all good to know");
        fancyPrint();
    }

    public static void fancyPrint() {
        System.out.println("*************");
        System.out.println("JAVA");
        System.out.println("*************");
        return;
    }
}

// Methods can take names of variables as parameters. However, they must be
// accompanied by
// variable type and name of variable
// method (String s) seperated by commas

class MethodTest {
    public static void main(String[] args) {
        System.out.println("We All Love");
        fancyPrint("JAVA");

        System.out.println("It's all good to know");
        fancyPrint("Programming");
    }

    public static void fancyPrint(String s) {
        System.out.println("*************");
        System.out.println(s);
        System.out.println("*************");
        return;
    }
}

class MethodTest3 {
    public static void main(String[] args) {

        int result1, result2, total;

        result1 = IntegerAdd(1, 2);
        result2 = IntegerAdd(100, 433);
        total = IntegerAdd(result1, result2);
        System.out.println(total);

        // Once we create the method below we can re-use it constantly

    }

    static int IntegerAdd(int num1, int num2) {
        // int above declares the type of result
        int result;

        result = num1 + num2;
        System.out.println(result);
        return result;
    }
}