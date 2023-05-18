/*Write a class with the name SimpleCalculator. The class needstwo fields(instance variables) with
names firstNumber and secondNumber both of type double.
Write the following methods(instance methods):
● Method named getFirstNumber without any parameters, it needsto return the value of the
firstNumber field.
● Method named getSecondNumber without any parameters, it needs to return the value of
the secondNumber field.
● Method named setFirstNumber with one parameter oftype double, it needsto set the value
of the firstNumber field.
● *Method named setSecondNumber with one parameter oftype double, it needsto set the
value of the secondNumber field.
● Method named getAdditionResult without any parameters, it needsto return the result of
adding the field values of firstNumber and secondNumber.
● Method named getSubtractionResult without any parameters, it needsto return the result of
subtracting the field values of the secondNumber from the firstNumber.
● Method named getMultiplicationResult without any parameters, it needsto return the result
of multiplying the field values of firstNumber and secondNumber.
● Method named getDivisionResult without any parameters, it needsto return the result of
dividing the field values of firstNumber by the secondNumber. In case the value of
secondNumber is 0 then return 0.
TEST EXAMPLE
TEST CODE:Write the bellow code into main method
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());*/
//___________________________________________________________________________________________________________//
public class SimpleCalculator

{
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator(); // created an object for simplecalculator class
        calculator.setFirstNumber(5.0);                         // calling setfirstnumber method
        calculator.setSecondNumber(4.0);                               // calling setsecondnumber method
        System.out.println("add = " +calculator.getAdditionResult());        //calling and printing addition method
        System.out.println("subtract = "+ calculator.getSubtractionResult()); //calling and printing subtraction method
        calculator.setFirstNumber(5.25);                                    // calling setfirstnumber method
        calculator.setSecondNumber(0);                                      // calling setsecond number method
        System.out.println("multiply =" +calculator.getMultiplicationResult()); //calling and printing multiply method
        System.out.println("divide=" + calculator.getDivisionResult()); // //calling and printing division method


    }
    double firstNumber,secondNumber;
//Method named getFirstNumber without any parameters, it needs to return the value of the
//firstNumber field.
    public double getFirstNumber(){
    return firstNumber;
    }
//Method named getSecondNumber without any parameters, it needs to return the value of
//the secondNumber field.

   public double getSecondNumber(){
        return secondNumber;
    }

   // Method named setFirstNumber with one parameter of type double, it needs to set the value
   // of the firstNumber field.

   public void setFirstNumber(double firstNumber){
        this.firstNumber =firstNumber;
    }

    //*Method named setSecondNumber with one parameter of type double, it needsto set the
    //value of the secondNumber field.

    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    //Method named getAdditionResult without any parameters, it needs to return the result of
    //adding the field values of firstNumber and secondNumber.

    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }

    //Method named getSubtractionResult without any parameters, it needsto return the result of
    //subtracting the field values of the secondNumber from the firstNumber.

    public double getSubtractionResult(){
        return firstNumber-secondNumber;

    }
    //Method named getMultiplicationResult without any parameters, it needsto return the result
    //of multiplying the field values of firstNumber and secondNumber.

    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }

    //Method named getDivisionResult without any parameters, it needs to return the result of
    //dividing the field values of firstNumber by the secondNumber. In case the value of
    //secondNumber is 0 then return 0.
    public double getDivisionResult(){
        if(secondNumber==0){
            return 0;
        }else {
            return firstNumber/secondNumber;
        }
    }
}
