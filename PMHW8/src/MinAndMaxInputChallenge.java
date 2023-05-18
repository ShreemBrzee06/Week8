import java.util.Scanner;
/*-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user entersthe number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.*/
public class MinAndMaxInputChallenge {
    public static void main(String[] args) // main method
    {
        MinAndMaxInputChallenge g = new MinAndMaxInputChallenge();
        g.mmc();
    }

    public void mmc() { // instance method
        Scanner n = new Scanner(System.in); // scanner class to call the user input value
        int min = 0;
        int max = 0;

        while (true) { // while loop is endless because condition is true
            System.out.println("Enter a number: ");
            if (n.hasNextInt()) {

               int m = n.nextInt();
                if(m>max)  {
                max=m;
            }else{ min=m;
                }
            }
            else {  break;


            }

        }System.out.println("Please enter valid number");
        System.out.println("The Minimum Number"+ min);
        System.out.println("The Maximum Number"+ max);
    }
}



