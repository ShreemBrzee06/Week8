/*Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative,the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative*/
public class GetEvenDigitSum
{
    public static void main(String[] args)
    {
        System.out.println( "The sum of even number: " +getEvenDigitSum(-22));
        System.out.println( "The sum of even number: " +getEvenDigitSum(123456789));
        System.out.println( "The sum of even number: " +getEvenDigitSum(252));

    }
   public static int getEvenDigitSum(int number){
       if (number<0) { // if number is less than '0' then it will return -1;
           return -1;
       }
    int sum= 0; // initialised sum
    while (number>0) // if number is greater than zero
    {
        int evenNumber = number%10;// this will give you
        if(evenNumber % 2==0) // if number divide by 2 and no remainder then that number
        {
           sum += evenNumber;
        }
        number/=10;

    }
    return sum;

    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

