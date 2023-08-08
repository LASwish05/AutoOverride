public class PflanzeVererbung extends LebewesenVererbung {

    boolean hatNadeln;
public PflanzeVererbung (int alter, double größe, boolean hatNadeln){
    super(alter, größe);
    this.hatNadeln = hatNadeln;
    System.out.println("Pflanzen Konstruktor");
}

    public void gebeFrüchte(){
        System.out.println("Früchte...");
    }

}
