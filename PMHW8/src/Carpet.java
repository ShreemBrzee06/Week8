
/*2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
type double.

The class needsto have one constructor with parameter cost of type double and it needsto initialize
the field.
In case the cost parameter is lessthan 0 it needsto set the cost field value to 0.

Write the following methods(instance methods):
● Method named getCost without any parameters, it needsto return the value of cost field*/
public class Carpet {

        double cost;

        public Carpet(double cost){
            if(cost<0){
                this.cost=0;
            }else{
                this.cost= cost;
            }

        }

        public double getCost(){
            return cost;
        }


    }
