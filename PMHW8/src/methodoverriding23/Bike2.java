package methodoverriding23;

public class Bike2 extends Vehicle{
    public static void main(String[] args) {
        Bike2 obj = new Bike2(); // created a child object
        obj.run(); // called a parent method
    }
    public void run(){ //defining same method as parent class but different out put
        System.out.println("Bike is running safely");
    }
}
