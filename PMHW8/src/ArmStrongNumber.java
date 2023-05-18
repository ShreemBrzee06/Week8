/*Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/


import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        armstrongNumbers();
    }

    public static void armstrongNumbers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = sc.nextInt();
        int r,temp, sum = 0;
        temp=n;
        while(n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("entered number is Armstrong number");
        }else {
            System.out.println("entered number is not Armstrong number");
        }

    }
}
