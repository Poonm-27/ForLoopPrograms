//Program to enter any String and count total number of 'a' in that String.
import java.util.Scanner;

public class CountCharacter {
    Scanner scanner = new Scanner(System.in);//create object of scanner class to read user input
    //no return type and no parameters
    void check_alphabet()
    {
        System.out.println("Enter any text which contains alphabet 'a' :");
        String text = scanner.nextLine();//returns next line of text
        System.out.println("The String given is: " + text);
         int count=0;
        for (int i = 0; i<text.length(); i++)
            {
                if ( text.charAt(i)== 'a') //checks if character at index position 'i' is equal to a
                {
                    count++;
                }
            }
        System.out.println("The total number of a's in the text is " +count);
    }
    //main method
    public static void main(String[] args)
    {
        CountCharacter countCharacter =new CountCharacter();//create object
        countCharacter.check_alphabet();//call non-static method
    }
}
