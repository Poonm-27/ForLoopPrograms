//Program to print months 1 to 12 using switch
import java.util.Scanner;

public class PrintMonth {
    Scanner scanner = new Scanner(System.in);//create object of scanner class to read user input
    //no return type and no parameters
    public void name_Of_month()
    {
        System.out.println("Enter any number form 1 to 12 for month");
        int num = scanner.nextInt();//returns the user integer input value
        System.out.println("The number is "+num);
        //evaluate the name of month based on number 1 to 12
        switch (num)
        {
            case 1: //checks if user inputs 1 then month is jan
                System.out.println("Therefore the month is January");
                break;
            case 2://checks if user inputs 2 then month is feb
                System.out.println("Therefore the month is February");
                break;
            case 3://checks if user inputs 3 then month is Mar
                System.out.println("Therefore the month is March");
                break;
            case 4://checks if user inputs 4 then month is april
                System.out.println("Therefore the month is April");
                break;
            case 5: //checks if user inputs 5 then month is may
                System.out.println("Therefore the month is May");
                break;
            case 6: //checks if user inputs 6 then month is june
                System.out.println("Therefore the month is June");
                break;
            case 7://checks if user inputs 7 then month is july
                System.out.println("Therefore the month is July");
                break;
            case 8: //checks if user inputs 8 then month is aug
                System.out.println("Therefore the month is August");
                break;
            case 9: //checks if user inputs 9 then month is sep
                System.out.println("Therefore the month is September");
                break;
            case 10: //checks if user inputs 10 then month is october
                System.out.println("Therefore the month is October");
                break;
            case 11: //checks if user inputs 11 then month is november
                System.out.println("Therefore the month is November");
                break;
            case 12: //checks if user inputs 12 then month is december
                System.out.println("Therefore the month is December");
                break;
            default: //if user inputs more than 12 than its invalid
                System.out.println("Invalid entry");
        }
    }
    //main method()
    public static void main(String[] args)
    {
        PrintMonth printMonth = new PrintMonth(); //create object
        printMonth.name_Of_month(); //call non-static method
    }
}
