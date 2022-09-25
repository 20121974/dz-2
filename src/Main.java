import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tack 5");
        int value;
        value = 33;
        changeValue(value);
        System.out.println(value);
        System.out.println();

        System.out.println("Tack 6");
        Integer val = 33;
        changeValue(val);
        System.out.println(val);
        System.out.println();

        System.out.println("Tack 7");
        Integer [] values = new Integer[]{3,4};
        changeValue(values);
        System.out.println(Arrays.toString(values));
        System.out.println();

        System.out.println("Tack 8");
        Integer [] values1 = new Integer[]{3,4};
        changeValue1(values1);
        System.out.println(Arrays.toString(values1));
        System.out.println();

        System.out.println("Tack 9");
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
        System.out.println();

        System.out.println("Tack 10");
        Person person1 = new Person("Lyapis", "Trubetskoy");
        changePerson1(person1);
        System.out.println(person1);
    }


    static int changeValue(int value) {
        value = 22;
        return value;
    }

    static void changeValue(Integer value) {
        value = 22;
    }

    static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
    }
    static void changeValue1(Integer[] value) {
        value [0] = 99;
    }
    static void changePerson (Person person) {
        person = new Person("Ilya", "Lagutenko");
    }
    static void changePerson1 (Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}