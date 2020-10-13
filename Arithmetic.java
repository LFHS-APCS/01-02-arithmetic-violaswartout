import java.util.*;

/**
 * Description: This lab demonstrates the arithmetic operations.
 */

public class Arithmetic
{    

    public static void main(String args[]) {
        Arithmetic a = new Arithmetic();
        a.chooseTest();
    }

    public void chooseTest() {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        while (choice != 5) {
            System.out.println("Type 1 (and enter) to test doubles.");
            System.out.println("Type 2 (and enter) to test integers.");
            System.out.println("Type 3 (and enter) to try convertTemperature.");
            System.out.println("Type 4 (and enter) to test convertTemperature.");
            System.out.println("Type 5 (and enter) to quit.");
            choice = scan.nextInt();
            if (choice == 1)
                testDoubles();
            else if (choice == 2)
                testIntegers();
            else if (choice == 3)
                tryConvertTemperature();
            else if (choice == 4)
                testConvertTemperature();

        }
    }
    /**
     * method to show how operations work with doubles
     */
    public void testDoubles()
    {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        // Get two doubles from the user
        System.out.println("Enter first double:");
        double a = scan.nextDouble();

        System.out.println("Enter second double:");
        double b = scan.nextDouble();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println();

    }

    /**
     * method to show how operations work with integers
     */
    public void testIntegers()
    {
        Scanner scan = new Scanner(System.in);
        // Get two integers from the user
        System.out.println("Enter first integer:");
        int a = scan.nextInt();

        System.out.println("Enter second integer:");
        int b = scan.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));
        System.out.println();

    }

    public void tryConvertTemperature() 
    {
        Temperature t = new Temperature();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a temperature in celsius (and hit enter):");
        double c = scan.nextDouble();
        double f = t.convertTemperature(c);
        System.out.println("Your program says that " + c + " in celsius is " + f + " in fahrenheit");

    }

    public void testConvertTemperature()
    {
        TemperatureTest t = new TemperatureTest();
        t.test_convertTemperature();
    }

}
