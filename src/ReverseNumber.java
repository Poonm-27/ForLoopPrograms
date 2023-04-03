//Program to reverse a given number

import java.util.Scanner;

public class ReverseNumber {
    //method with no return type and no parameters (non-static method)
    void convert()
    {
        Scanner scanner=new Scanner(System.in);//create object scanner to scan the user input
   // use new keyword to create instance of the Scanner class
        System.out.println("Enter the number to be reversed: ");
        long num = scanner.nextLong();//returns the user input in long datatype number
        System.out.println("The number to be reversed is : "+num);
        long reverse = 0;
        for(    ; num>0; num = num / 10)
        {
            long remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is " +reverse); //prints the reverse of a number
    }
//main method
    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();//create object
        reverseNumber.convert();//call non-static method into main
    }

}
