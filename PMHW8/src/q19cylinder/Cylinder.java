package q19cylinder;
/*2. Write a class with the name Cylinderthat extends Circle class. The class needs one field (instance
variable) with name height of type double.
The class needsto have one constructor with two parametersradius and height both oftype double.
It needs to call the parent constructor and initialize a height field.
In case the height parameter islessthan 0 it needsto set the height field value to 0.
Write the following methods (instance methods):
● Method named getHeight without any parameters, it needsto return the value of height
field.

● Method named getVolume without any parameters, it needsto return the calculated volume.
To calculate volume, multiply the area with height.*/
//_______________________________________________________________________________________________________//
public class Cylinder extends Circle
{
    double height; // instance variable type double

    //The class needsto have one constructor with two parametersradius and height both oftype double.
    //It needs to call the parent constructor and initialize a height field.
    //In case the height parameter islessthan 0 it needsto set the height field value to 0.
    public Cylinder(double radius, double height) {
        super(radius);
        if (height<0){
            this.height =0;
        }else {this.height =height;}

    }

    //Method named getHeight without any parameters, it needs to return the value of height
    //field.

   public double getHeight(){
            return this.height;
    }

    //Method named getVolume without any parameters, it needsto return the calculated volume.
    //To calculate volume, multiply the area with height.

    public double getVolume(){
        return height * getArea();
    }
}
