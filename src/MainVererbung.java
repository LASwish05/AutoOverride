public class MainVererbung {
    public static void main(String[] args) {
        //LebewesenVererbung lebewesen = new LebewesenVererbung();
        //lebewesen.fortPflanzen();

        System.out.println();

        //TierVererbung tier = new TierVererbung();
        //tier.fortPflanzen();
        //tier.machGeräusch();

        System.out.println();

        PflanzeVererbung pflanze = new PflanzeVererbung(100, 10.5, false);
        System.out.println(pflanze.alter);



    }
}
