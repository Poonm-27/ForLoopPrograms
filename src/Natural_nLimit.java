//Program to display n limit of natural numbers and their sum
import java.util.Scanner;

public class Natural_nLimit
{
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create object scanner to scan the user input
        System.out.println("Enter any number:");
        int number = scanner.nextInt();//read user input of integer datatype
        System.out.println("Entered number is "+number);
        System.out.println("The limit of "+number+ " natural numbers is:");
        int sum=0;
        for (int i = 1; i <=number; i++)
        {
            System.out.println(i);//prints value of i repeatedly after incrementing until (i<=number) becomes false
            sum+=i; //sum =sum + i
        }
        System.out.println("Sum of " +number+ " natural numbers= " +sum);//print sum of n natural numbers
    }
}
