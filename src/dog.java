public class dog {
    //Attribute
    int alter;
    String art;
    String fellfarbe;
    boolean kannPfoteGeben;

    //Konstruktor           muss gleichen namen wie classe haben und benötigt kein void, somit erkennt ihn das Programm automatisch als Konstruktor
    public dog(int alter, String art, String fellfarbe, boolean kannPfoteGeben){
        this.alter = alter;
        this.art = art;
        this.fellfarbe = fellfarbe;
        this.kannPfoteGeben = kannPfoteGeben;
    }

    //Methoden
    public void bellen(){
        System.out.println("Wuff Wuff");
    }
    public void plusRechnen(int zahl1, int zahl2){
        System.out.println(zahl1 + zahl2);
    }
}
