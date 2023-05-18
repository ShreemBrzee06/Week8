/*Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each numbershould be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,such as 2 in 12 and 23;
otherwise, the method should return false.*/

public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(8, 103));
        System.out.println(hasSharedDigit(16, 22));
        System.out.println(hasSharedDigit(22, 22));


    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {

            int num3 = num1 % 10; // last digit 12 = 2 // first number
            int num4 = num2 % 10; // last digit 23 = 3 // second number
            int num5 = num1 /= 10; // first digit 12 = 1 // first number
            int num6 = num2 /= 10;// first digit 23 = 2 // second number


            return ((num5 == num6) || (num5 == num4) || (num3 == num6) || num4 == num3);

            }
        return false;
        }


    }


















