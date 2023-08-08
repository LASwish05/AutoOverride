
public class AutoOverride extends FahrzeugOverride{

        int geschwindigkeit = 120;

        public void fahren(){
            super.fahren();
            System.out.println("Brum brum");
        }

    @Override
        public int getGeschwindigkeit() {
        return super.geschwindigkeit;
    }
    }

