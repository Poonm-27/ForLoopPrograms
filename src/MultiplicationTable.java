//Program to find multiplication table for the given number
import java.util.Scanner;
public class MultiplicationTable {
    Scanner scanner= new Scanner(System.in);//create scanner object in scanner class to read user input
    //no return type no parameters
    void printTable ()
    {
        System.out.println("Enter the number:");
        int input = scanner.nextInt();//returns integer value
        System.out.println("The number you entered ="+input);
        System.out.println("The multiplication table of number "+input+ " is:");
        //calculates the multiplication of any input number until 12 no. of times
        for (int i = 1; i <= 12 ; i++)
        {
            System.out.println(input+ "*" +i+ "=" +(input*i));
        }
    }
//main method
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();//create object
        multiplicationTable.printTable();//call non-static method
    }
}
