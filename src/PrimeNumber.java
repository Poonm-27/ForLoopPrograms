//Program to find the given number is prime number or not
import java.util.Scanner;

public class PrimeNumber {
    Scanner scanner = new Scanner(System.in);//create object scanner to scan the user input
    // use new keyword to create instance of the Scanner class

    //method with no return type and no parameters (non-static method)
    void findPrime()
    {
        System.out.println("Input a number: ");
        int num = scanner.nextInt();// variable 'num' declared for entering integer input from user and scanner scans it
        System.out.println("The number entered is: " +num);
        int count = 0;
        if(num>1)
        {
            for (int i = 1; i <=num ; i++)
            {
                if(num%i == 0)
                    count++;
            }
            if(count == 2)
            {
                System.out.println(num+ " is a Prime Number");
            }
            else
            {
                System.out.println(num+ " is not a Prime Number");
            }
        }
        else
        {
            System.out.println(num+ " is not a Prime Number");
        }
    }
//main method
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();//create object
        primeNumber.findPrime();//call non-static method into main
    }
}
