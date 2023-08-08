public class KundeKonstruktoren {
    String name;
    int alter;
    String email;
    String telefonnummer;

    public KundeKonstruktoren (String name, int alter, String email, String telefonnummer) {
        this.name = name;
        this.alter = alter;
        this.email = email;
        this.telefonnummer = telefonnummer;
        System.out.println("Konstruktor mit 4 Argumenten");
    }
    public KundeKonstruktoren (String name, int alter){
        this.name = name;
        this.alter = alter;
        email = "";
        telefonnummer = "";
        System.out.println("Konstruktor mit 2 Argumenten");
    }

    public KundeKonstruktoren (){
        System.out.println("Leerer Konstruktor");
    }

}
