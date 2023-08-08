public class LebewesenVererbung {
int alter;
double größe;

public LebewesenVererbung(int alter, double größe){
    this.alter = alter;
    this.größe = größe;
    System.out.println("Lebewesen Konstruktor");
}

    public void fortPflanzen(){
        System.out.println("Fortpflanzen...");
    }

    public void wachsen (){
        this.größe++;
    }

}
