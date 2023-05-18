import java.util.Scanner;

/*12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only.
//In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17... are the prime numbers.)

*/
public class PrimenumberorNot {

    public static void main(String[] args) {
        primeNumber();
    }

   public static void primeNumber()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter your number");
       int num = sc.nextInt();
     boolean isPrime = true;


       if (num == 1)
       {
           System.out.println(num+ " " + "is Prime Number.");
       }
       for (int i=2;i<=num/2;i++ ) {

           if (num % i == 0) {
               isPrime = false;
               break;
           }
       } if(isPrime) {
       System.out.println(num + " " + "is prime number");
   }else {

       System.out.println(num +" "+ "is not prime number");
   }
       }
      }




