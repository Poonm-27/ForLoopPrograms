//Program to find factorial of a given number
import java.util.Scanner;

public class Factorial {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create scanner object
        System.out.println("Enter the number");
        int num_fact = scanner.nextInt();//read user input in integer number
        System.out.println("The number entered is " +num_fact);//output user input
        int fact = 1;

        //find factorial of a number
        for (int i = 2; i <= num_fact; i++)
        {
          fact = fact * i;
        }
        System.out.println("The Factorial of "+num_fact+ " is " +fact);//prints factorial
    }

}
