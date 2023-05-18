public class Main {
    public static void main(String[] args) {
        Carpet carpet= new Carpet(3.5);                         // object for carpet with constructor passing value
        Floor floor = new Floor(2.75,4.0);              // object for floor with constructor passing value
        Calculator calculator =new Calculator(floor, carpet);       // object for calculator with constructor passing value
        System.out.println("total =" + calculator.getTotalCost()); //calling calculator class gettotal cost method

        carpet = new Carpet(1.5);                           // object for carpet with constructor passing value
        floor = new Floor(5.4,4.5);                 //object for floor with constructor passing value
        calculator = new Calculator(floor,carpet);              //object for calculator with constructor passing value
        System.out.println("total="+ calculator.getTotalCost());//calling calculator class gettotal cost method

    }
}