// Why are objects important?

// Think of objects not just locks of code and data but of Service
// Service to the class

// eg. Objects of a checking account will provide:
// Current Balance, account number, last deposit.
// Likewise this checking account may work with another object 
// to get customerInfo such as address or name.

// So an app is essentially a collection of many self-contained
// objects that communicate with each other
// providing and requesting service.
// This is what Object Oriented Programming is

// It is different to procedural programming where each
// programmes are seen as a sequence of actions performed by procedures
// eg. if this, then do that, or do this.

// As an object oriented programmer:
// Identify objects in the problem space
// Find overall solution based on projects that provide/ request service

public class AppUdemyOOP {

}

// Writing a program that turns miles to KM

// public class TestMilesKM {
// public static void main(String args[]) {
// int miles = 20;
// int km = 20;
// double isMiles, isKM;

// isKM = miles * 1.6;
// isMiles = km * 0.6;

// System.out.println("20 Miles: " + isKM + "KM");
// System.out.println("20 KM: " + isMiles + "Ms");
// }
// }

// This isn't OOP.
// What can be written as objects? Or what can be seen as services?

// Converting KM to miles
// Convert Miles to KM

class MilesKM { // Service provider
    public double toMiles(double km) {
        return (km * .6);
        // method that takes an attribute (or value as km)
    }

    public double toKM(double miles) {
        return (miles * 1.6);
        // method that takes an attribute (or value as miles)
    }
}

class TestMilesKMoop {
    public static void main(String args[]) {
        int miles = 20; // user input
        int km = 20; // user input
        double isMiles, isKM; // Store the data
        // instantiate new objects converting miles to KM
        // and vice versa

        MilesKM mkconv = new MilesKM(); // the mkconv is like multplication, the service
        // We must instantiate into a type of MilesKM
        // give this the name mkconv
        // link is an a new attribute of MilesKM
        // meaning we created a new type as MilesKM

        isKM = mkconv.toKM(miles);
        // toKM is the multiplier (1.6)
        // miles is user input
        isMiles = mkconv.toMiles(km);
        // toMiles is the multiplier (.6)
        // km is user input

        System.out.println("20 Miles:" + isKM + "KM");
        System.out.println("20 KM:" + isMiles + "Ms");
    }
}

// We have created a self-contained class that can be used by other objects.

class InchesCM {
    public double ToCM(double cm) {
        return (cm * 2.54);
    }

    public double ToInches(double inches) {
        return (inches * .39);
    }
}

class TestInchesCM {
    public static void main(String[] args) {
        int cm = 20;
        int inches = 20;
        double isCM, isInches;

        InchesCM ICconv = new InchesCM();

        isInches = ICconv.ToCM(inches);
        isCM = ICconv.ToInches(cm);

        System.out.println("20 inches:" + isInches + "cm");
        System.out.println("20cm :" + isCM + "inches");
    }
}

class DollarsEuro {
    public double ToDollars(double dollar) {
        return (dollar * .94);
    }

    public static double ToEuro(double euro) {
        return (euro * 1.07);
    }
}

class TestDollarsEuro {
    public static void main(String[] args) {
        int euro = 5;
        int dollar = 5;
        double isDollars, isEuro;

        DollarsEuro DEconv = new DollarsEuro();

        isDollars = DEconv.ToEuro(dollar);
        isEuro = DEconv.ToEuro(euro);

        System.out.println("5 euros: " + isEuro + "dollars");
        System.out.println("5 dollars :" + isDollars + "euros");
    }
}

class FarhCelcius {
    public double ToFarh(double Celcius) {
        return (Celcius * -17.2);
    }

    public double ToCelcius(double Farh) {
        return (Farh * 33.8);
    }
}

class TestFarhCelcius {
    public static void main(String[] args) {
        int Celcius = 10;
        int Farh = 10;
        double isCelcius, isFarh;

        FarhCelcius FCconv = new FarhCelcius();

        isFarh = FCconv.ToCelcius(Farh);
        isCelcius = FCconv.ToFarh(Celcius);

        System.out.println(" 10 Farf is " + isFarh);
        System.out.println("10 Celcius:" + isCelcius + "Celcius");
    }
}