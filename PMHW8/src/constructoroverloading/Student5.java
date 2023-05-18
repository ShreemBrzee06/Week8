package constructoroverloading;

public class Student5 {

    public static void main(String[] args)
    {
        Student5 s1 = new Student5(111,"Karan");
        Student5 s2 = new Student5(222,"Aryan", 25);
        s1.display();
        s2.display();
    }
    int id;
    String name;
    int age;

     Student5(int i, String n){ // two argument constructor
        id =i;
        name=n;
    }

     Student5 (int i, String n, int a){ // three argument constructor
        id = i;
        name= n;
        age= a;
    }
    public void display(){
        System.out.println(id+ " "+ name + " " +age);
    }

}
