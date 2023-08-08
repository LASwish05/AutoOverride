public class FahrzeugOverride {
    int geschwindigkeit = 80;

    public void fahren () {
        System.out.println("Motor gestartet");
    }

        public int getGeschwindigkeit() {
            return this.geschwindigkeit;
        }

        @Override
    public String toString(){
            return "Das ist ein Fahrzeug mit folgender Geschwindigkeit: " + geschwindigkeit;
        }

}
