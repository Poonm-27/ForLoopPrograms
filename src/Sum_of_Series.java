//Program to calculate the sum of following series 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
// where n is input by user. (where n is a positive integer and input by user.)
import java.util.Scanner;
public class Sum_of_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create object of scanner class to read user input
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt(); // input the number of fractions in the series
        System.out.println("n = " +n);
        double sum=0; //variable to store the total of sum

        if (n >= 0)  //checks if user input number is positive or not
        {
            //use a for loop to iterate over the numbers in the series
            // and find the sum of series till 1/nth term
            for (int i = 1; i <= n; i++)
            {
                sum = sum + (double) 1 / i; //add the next fraction to the sum
            }
            System.out.println("The sum of the series 1 + 1/2 + ..... +1/"+n+ " is: " +sum);//print sum in float value
        }
        else
        {
            System.out.println("The number less than 0 is negative. Please enter positive number");
        }
    }
}
