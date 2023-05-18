/*15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * **/
public class TrianglePatternUsingNestedloop
{
    public static void main(String[] args)
    {
       starTriangle(5);
    }

   public static void starTriangle(int n)
   {
       for (int i=1; i<=n;i++){
           for(int j=1; j<=i; j++){
               System.out.print("* ");
           }
           System.out.println();
       }

   }
}
