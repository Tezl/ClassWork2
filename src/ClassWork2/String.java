package ClassWork2;

public class String {
    public static void main(String[] args) {

        Cat catNull = null;
        Cat cat = new Cat();
        Cat anotherCat = cat;
        Cat cat3 = new Cat();
        Cat cat4 = anotherCat;

        System.out.println(catNull);
        System.out.println(cat);
        System.out.println(cat.toString());

        System.out.println("Another cat " + anotherCat);
        System.out.println("3 cat: " + cat3);
        System.out.println();

        cat = null;


        /*String string = "";
        String string1 = "Some Text";
        String string2 = new String("Test");

        System.out.println(string);
        System.out.println(string1);
        System.out.println(string2);

        string1 = string1 + "new text";*/


    }
}
