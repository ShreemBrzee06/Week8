/*8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@*/

import java.util.Scanner;

public class TrianglePattern
{
    public static void main(String[] args)
    {

        trianglePattern();
    }

    public static void trianglePattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter of number of rows: ");
        int  n= sc.nextInt();

        for(int i=1; i<=n; i++){
              for(int j=1; j<=i;j++){
                  System.out.print("@");
              }
            System.out.println();
        }


     }


    }

