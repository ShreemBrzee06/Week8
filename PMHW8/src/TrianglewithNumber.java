import java.util.Scanner;
/*6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910*/
public class TrianglewithNumber {
    public static void main(String[] args)
    {
        pattern();
    }
    public static void pattern(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of rows: ");
        b =sc.nextInt();
        String str = "";
        for(a =1; a<=b;a++){
            str +=a;
            System.out.println(str);
            }
        }
    }




