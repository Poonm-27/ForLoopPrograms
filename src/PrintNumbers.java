//Program to print any 10 numbers between given/user input range.

import java.util.Scanner;
public class PrintNumbers {
    //main method
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //scanner object to scan user input
        System.out.println("Enter the starting number in range");
        int start_num = scanner.nextInt(); //reads the integer value from user
        System.out.println("Enter the ending number in range");
        int end_num = scanner.nextInt();
        System.out.println("The range given is: "+start_num+ "-" +end_num);
        for (int i = start_num; i <=end_num; i++)
        {
            System.out.println(i);//print all the numbers in the range

        }
    }
}
