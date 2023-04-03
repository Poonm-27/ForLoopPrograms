//Program to find sum of x ranging from 1 to 20
import java.util.Scanner;

public class Sum_Of_Range {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create object scanner to scan the user input
        System.out.println("Enter any range of two numbers (example: 1-5) :");
        int value1 = scanner.nextInt();//returns the integer value from user
        int value2 = scanner.nextInt();
        System.out.println("The number range entered is " +value1+ " to " +value2+ ".");
        int sum=0;
        for (int i = 1; i <=value1; i++)
        {
            if (i<=value2)
            {
                sum+=i; //sum=sum+i
                value1++;
            }
        }
        System.out.println("Sum of the range= " +sum);
    }
}


