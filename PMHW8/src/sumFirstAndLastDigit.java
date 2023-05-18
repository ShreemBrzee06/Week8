/*First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needsto find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needsto return -1 to indicate an invalid value.

Example input/output
* sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
* sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which

gives us 0+0 and the sum is 0.

* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which

gives us 5+5 and the sum is 10.

* sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.*/

public class sumFirstAndLastDigit {
    public static void main(String[] args) {
       sumFirstAndLastDigit(-10);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(252);
       sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
    }

    public static int sumFirstAndLastDigit(int number) {
        System.out.println("Entered number : " + number);//printing number entered
        if (number > 0 || number == 0) {

            int firstDigit = 0; // initialised first digit
            int lastDigit = 0; // initialised second digit
            int result= 0;
            lastDigit = Math.abs(number % 10); // by modulus with 10

            while (number != 0) { // When number is positive
                firstDigit = Math.abs(number % 10); // to get first digit number
                number = number / 10;

            }
             result = firstDigit + lastDigit;

            System.out.println("The first digit of an integer: " + firstDigit);
            System.out.println("The last digit of an integer: " + lastDigit);
            System.out.println("The sum of first and last digit is : = " + (firstDigit + lastDigit));
            return result;
        } else  {

            return -1;
        }


    }

    }






