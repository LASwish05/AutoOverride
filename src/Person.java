public class Person {
    public static int personCount = 0;
    public String name;


    public Person(String name) {
        this.name = name;
        personCount++;
    }
}
