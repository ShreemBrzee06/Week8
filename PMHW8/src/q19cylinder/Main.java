package q19cylinder;

public class Main
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(3.75); // created an object where constructor is passing argument
        System.out.println("circle.radius =" + circle.getRadius()); // calling and printing getRadius method
        System.out.println("circle.area= " + circle.getArea()); // calling and printing getArea method

        Cylinder cylinder = new Cylinder(5.55, 7.25); // created an object for cylinder with constructor passing an argumnet
        System.out.println("cylinder.radius= " + cylinder.getRadius());// calling and printing getRadius method
        System.out.println("cylinder.height= " + cylinder.getHeight()); // calling and printing getHeight method
        System.out.println("cylinder.area= " + cylinder.getArea()); // calling and printing getArea method
        System.out.println("cylinder.volume= " + cylinder.getVolume());// calling and printing getVolume method

    }



}
