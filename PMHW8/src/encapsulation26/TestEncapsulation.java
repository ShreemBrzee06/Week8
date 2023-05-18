package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Krishna");
        obj.setAge(45);
        obj.setRollNo(51);

        System.out.println("CodeBuster name: "+ obj.getName());
        System.out.println("CodeBuster age: " + obj.getAge());
        System.out.println("CodeBuster rollNo: " + obj.getRollNo());
    }
}
