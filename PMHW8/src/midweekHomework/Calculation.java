package midweekHomework;

import java.util.Scanner;

/*Write a “main” method into main class. It has scanner that takes user  input. Also write the logic that it ask user to “Enter first Number:”,  “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user  enter + symbol result like “Addition of 5 and 10 is: 15” and respective  for other symbol.
 2. With the result it’s also print one more message “Would you like to do  more calculation Please enter “Y” or “N” :” (Hint use while loop if user  enter Y program asking the user to enter First Number, and if user enter  N programme should terminate)
*/
public class Calculation {

    public static void main(String[] args)
    {
        calmethod();
    }

    public static void calmethod(){
        String choice = "Y";

        while(choice.equalsIgnoreCase("Y")){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter your second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Please enter operatores: '+', '-', '*','/'");
        char operator =sc.next().charAt(0);

             if (operator == '+') {
                 System.out.println("The addition of: " + firstNumber + "firstNumber +" + secondNumber + " " + " is = " + (firstNumber + secondNumber));
             } else if (operator == '-') {
                 System.out.println("The subtraction of: " + firstNumber + " " + " and " + " " + secondNumber + "" + " is = " + (firstNumber - secondNumber));
             } else if (operator == '*') {
                 System.out.println("The multiplication of: " + firstNumber + " " + "and +" + secondNumber + " " + " is =" + (firstNumber * secondNumber));
             } else if (operator == '/') {
                 System.out.println("The division of: " + firstNumber + " " + " and +" + secondNumber + "  " + " is =" + (firstNumber / secondNumber));
             }
        System.out.println("Would you like to continue with method: yes or no");
             choice = sc.next();

        }
        System.out.println("Program terminated.");

    }






    }

