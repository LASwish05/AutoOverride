public class MainOverride {
    public static void main(String[] args) {
        FahrzeugOverride fahrzeug1 = new FahrzeugOverride();
        fahrzeug1.fahren();
        //System.out.println(fahrzeug1.toString());
        System.out.println(fahrzeug1);

        System.out.println();

        FahrzeugOverride auto1 = new AutoOverride();
        auto1.fahren();
        System.out.println(auto1.geschwindigkeit);
    }
}
