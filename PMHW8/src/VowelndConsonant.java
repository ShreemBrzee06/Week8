import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant*/
public class VowelndConsonant {

    public static void main(String[] args)
    {
        vowelcononant();
    }

    public static void vowelcononant() //
    {
        Scanner m = new Scanner(System.in); // scanner class to input value
        System.out.println("Please enter single character between a to z / A to Z : ");// asking user to input value
        String alphabet = m.next(); // saved in string

        // put condition for vowels
        if(alphabet.equalsIgnoreCase("A")|| alphabet.equalsIgnoreCase("e")||alphabet.equalsIgnoreCase("i")||alphabet.equalsIgnoreCase("o")||alphabet.equalsIgnoreCase("u"))
        {
            System.out.println("Input alphabet is: " + alphabet);
            System.out.println("Input letter is Vowels");

        } else if (alphabet.length()>1 )
        { // put condition for string length
            System.out.println("Please enter valid single Alphabet");
        }else{
            System.out.println("Your entered alphabet is : "+ alphabet );
            System.out.println("Entered alphabet is Consonants");
        }

    }
}
