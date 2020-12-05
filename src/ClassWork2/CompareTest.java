package ClassWork2;

public class CompareTest {
    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 0;

        if (number1 == number2) {
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }


        Person person1 = new Person();
        person1.name = "Dasha";

        Person person2 = new Person();
        person2.name = "Dasha";
        System.out.println(person1 == person2);










    }


}
