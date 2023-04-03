
//Program for Calculator(Arithmetic operations) using the switch statement
import java.util.Scanner;

public class CalculatorProgram {
    //create object and scan the input
    Scanner scanner = new Scanner(System.in);
    //declaring local variables with specific datatype
    double num1;
    double num2;
    double sum;
    double difference;
    double multiply;
    double division;

    char symbol;

    //no return type no parameters (non-static method)
    void arithmetic_operations()
    {
        System.out.println("Enter any two numbers:"); //prints text to the screen
        num1 = scanner.nextDouble(); //initialize double datatype value to the variable when user inputs the value and scanner scan it
        num2 = scanner.nextDouble();
        System.out.println("The Numbers you entered are "+num1+ " and " +num2);
        System.out.println("Enter any symbol from (+, -, / or *):");
        symbol = scanner.next().charAt(0);
        System.out.println("The symbol you entered is "+symbol);

        switch (symbol)
        {
            //verify if symbol is + then performs addition
            case '+':
                System.out.println("'"+symbol+"'"+" symbol denotes addition.");
                sum = num1 + num2;//perform addition
                System.out.println(num1 + " " + symbol + " " + num2 + " = " + sum);
                System.out.println("Sum of numbers=" + sum);
                break;
            //verify if symbol is - then performs subtraction
            case '-':

                System.out.println("'"+symbol+"'"+" symbol denotes subtraction.");
                difference = num1 - num2; //perform subtraction
                System.out.println(num1 + " " + symbol + " " + num2 + " = " + difference);
                System.out.println("Difference of numbers=" +difference);
                break;
            //verify if symbol is * then performs multiplication
            case '*':
                System.out.println("'"+symbol+"'"+" symbol denotes multiplication.");
                multiply = num1 * num2;//perform multiplication
                System.out.println(num1 + " " + symbol + " " + num2 + " = " + multiply);
                System.out.println("Multiplication of numbers=" +multiply);
                break;
            //verify if symbol is / then performs division
            case '/':
                System.out.println("'"+symbol+"'"+" symbol denotes division.");
                division = num1 / num2;//perform division
                System.out.println(num1 + " " + symbol + " " + num2 + " = " + division);
                System.out.println("Division of numbers=" +division);
                break;

            default:
            System.out.println("Invalid symbol");//print "Invalid symbol" to the screen
        }
    }
    // main method
    public static void main(String[] args) {
        CalculatorProgram calculator = new CalculatorProgram();//create object and call non-static method
        calculator.arithmetic_operations(); //call non-static method into main()
    }
}
