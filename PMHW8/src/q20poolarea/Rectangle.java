package q20poolarea;
/*1. Write a class with the name Rectangle. The class needstwo fields(instance variable) with name
width and length both of type double.
The class needsto have one constructor with parameters width and length both of type double and it
needs to initialize the fields.

In case the width parameter is lessthan 0 it needs to set the width field value to 0.
In case the length parameter islessthan 0 it needsto set the length field value to 0.
Write the following methods (instance methods):
● Method named getWidth without any parameters, it needsto return the value of the width
field.
● Method named getLength without any parameters, it needsto return the value ofthe length
field.
● Method named getArea without any parameters, it needsto return the calculated area
(width * length).*/
public class Rectangle
{
    double width, length;

    public Rectangle(double width, double length){
        if(width<0){
            this.width=0;
        } else if (length<0) {
            this.length=0;
        }else{
            this.length=length;
            this.width=width;
        }

    }

    //Method named getWidth without any parameters, it needs to return the value of the width
    //field.

    public double getWidth(){
        return width;
    }
    // Method named getLength without any parameters, it needsto return the value ofthe length
    //field.
    public double getLength(){
        return length;
    }
// Method named getArea without any parameters, it needsto return the calculated area
//(width * length).

    public double getArea(){
        return width*length;
    }

}
