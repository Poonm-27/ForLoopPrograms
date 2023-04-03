//Program to display the sum of n natural numbers
import java.util.Scanner;

public class NaturalNumber {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create object scanner to scan the user input
        System.out.println("Enter any number:");
        int number = scanner.nextInt(); //reads the integer value from user
        System.out.println("The number entered is " +number);
        int sum=0;
        for (int i = 1; i <=number; i++)
        {
            sum+=i; //sum=sum+i
        }
        System.out.println("Sum of " +number+ " natural numbers= " +sum);

    }

}
