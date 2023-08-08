public class PersonMain {
    public static void main(String[] args) {
        Person stefan = new Person("Stefan");
        System.out.printf("Welcome %s, we now have %d persons!\n", stefan.name, Person.personCount);
        Person ines = new Person("Ines");
        System.out.printf("Welcome %s, we now have %d persons!\n", ines.name, Person.personCount);

    }
}
