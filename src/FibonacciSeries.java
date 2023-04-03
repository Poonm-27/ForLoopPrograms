//Program to print n number of fibonacci series
import java.util.Scanner;

public class FibonacciSeries {
    //main method()
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//scanner class allowing user input to scan
        System.out.println("Enter the maximum number until which you want to get fibonacci series: ");
        int max = scanner.nextInt();//takes the next input as integer datatype
        System.out.println("The number given is "+max);
        int num1 = 0; //variable declaration and initialization
        int num2 = 1;
        //steps to print fibonacci series
        for (int i = 0; i <= max; i++) //for(initialisation;boolean condition;increment)
        {
            System.out.println(num1); //prints value of num1
            int sum = num1 + num2; // calculates value of sum (sum =0+1 = 1)
            num1 = num2; //initialize value of num2 to num1
            num2 = sum; //initialize value of sum to num2
        }
    }
}
