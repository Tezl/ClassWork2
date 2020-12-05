package ClassWork2;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person();

        person1.setName("Masha");
        person1.setAge = 15;

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        Person person2 = person1;

        changePerson(person2);
    }



    public static void changePerson(Person person) {

        person.getName() += "changed";
        person.getAge() += 162;





    }

}
