//Program to print any numbers between ,1 to 100 which can be divided
// by 3 and 5 separately
import java.util.Scanner;
public class PrintNumbersDivide {
    Scanner scanner = new Scanner(System.in);//create object for scanner class to scan the input
    //no return type and no parameters
    void number_display()
    {
        System.out.println("Enter any two numbers between 1 to 100:");
        int num1 = scanner.nextInt();//reads the first input value
        int num2 = scanner.nextInt();//reads the second input value
        System.out.println("The range of numbers given : " +num1+ " to " +num2);
        if(num1>=1 && num2<=100) //checks if number is between 1 - 100
        {
            System.out.println("The numbers divisible by 3 in the given range are: ");
            for (int i = num1; i <= num2; i++)
            {
                if ((i % 3) == 0) //checks if number is divided by 3 and remainder is 0
                {
                    System.out.println(i + " "); // prints that number
                }
            }
            System.out.println("The numbers divisible by 5 in the given range are: ");
            for (int i = num1; i <= num2; i++)
            {
                if ((i % 5) == 0)  //checks if number is divided by 5 and remainder is 0
                {
                    System.out.println(i + " "); //prints that number
                }
            }
        }
        else
        {
            System.out.println("Invalid entry");
        }
    }
//main method
    public static void main(String[] args)
    {
        PrintNumbersDivide printNumbersDivide = new PrintNumbersDivide();
        printNumbersDivide.number_display();//call non-static method into main()
    }

}



