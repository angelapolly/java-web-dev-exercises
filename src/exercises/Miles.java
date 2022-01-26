package exercises;

import java.util.Scanner;

public class Miles {
    public static void main (String[] args) {
        double milesDriven;
        double gasUsed;
        double milesPerGallon;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        milesDriven = input.nextDouble();
        System.out.println("Enter the number of gallons of gas used: ");
        gasUsed = input.nextDouble();
        input.close();

        milesPerGallon = (milesDriven / gasUsed);
        System.out.println("The miles per gallon is: " + milesPerGallon);
    }
}
