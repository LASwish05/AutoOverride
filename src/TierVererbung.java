public class TierVererbung extends LebewesenVererbung{

    String geräusch;
    boolean kannFliegen;

    public TierVererbung (int alter, double größe, String geräusch, boolean kannFliegen){
        super(alter, größe);
        this.geräusch = geräusch;
        this.kannFliegen = kannFliegen;
    }

    public void machGeräusch(){
        System.out.println("geräusch...");
    }

}
