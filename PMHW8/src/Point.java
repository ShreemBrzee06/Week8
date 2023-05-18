/*You have to represent a point in 2D space. Write a class with the name Point. The class needstwo
fields (instance variables) with name x and y of type int.
The class needsto have two constructors. The first constructor does not have any parameters(no-arg
constructor). The second constructor has parameters x and y of type int and it needsto initialize the
fields.
Write the following methods(instance methods):
* Method named getX without any parameters, it needsto return the value of x field.
* Method named getY without any parameters, it needsto return the value of y field.
* Method named setX with one parameter oftype int, it needs to set the value of the x field.
* Method named setY with one parameter oftype int, it needs to set the value of the y field.
* Method named distance without any parameters, it needsto return the distance between this
Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance
between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needsto return the distance
between this Point and another Point as double.
How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.
TEST EXAMPLE
→ TEST CODE: Write the below code into the main method.
Point first = new Point(6, 5);
Pointsecond = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());

System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());
OUTPUT
distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0
NOTE: Use Math.sqrt to calculate the square root √.
NOTE: Try to avoid duplicated code.
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 7 methods.*/

public class Point
{   int x, y;
    public static void main(String[] args)
    {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

   public Point(){ // constructor without argument

    }
    public Point(int x, int y){ // 2nd constructor with two arguments with initializing x and y
        this.x =x;
        this.y=y;
    }
    //Method named getX without any parameters, it needs to return the value of x field.
    public int getX()
    {
        return x;
    }
    //Method named getY without any parameters, it needsto return the value of y field.
    public int getY()
    {
        return y;
    }
    //* Method named setX with one parameter of type int, it needs to set the value of the x field.

    public void setX(int x){
        this.x =x;
    }
    //Method named setY with one parameter of type int, it needs to set the value of the y field.

    public void setY(int y){
        this.y=y;
    }
    //Method named distance without any parameters, it needs to return the distance between this
    //Point and Point 0,0 as double.
  //____________________________________________This bit I dont understand__________________________________________//
   public double distance(){
        return distance(0,0);
        //return Math.sqrt(this.x *this.x +this.y *this.y);
    }
//    * Method named distance with two parameters x, y both of type int, it needs to return the distance
//between this Point and Point x,y as double.

    public double distance(int x, int y ){

        return Math.sqrt(this.x -x)*(this.x -x) +(this.y -y) *((this.y-y));
    }

    //Method named distance with parameter another of type Point, it needsto return the distance
    //between this Point and another Point as double.
    //How to find the distance between two points?

    public double distance(Point secondPoint) { // this returns distance between this point and another point

        return distance(secondPoint.x, secondPoint.y);
    }
}




