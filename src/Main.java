public class Main {
    public static void main(String[] args) {
        dog laprador = new dog(4, "Laprador", "Schwarz", true);
        dog dackel = new dog(1, "Dackel", "Braun", false);
        dog mops = new dog(10, "Mops", "Weiß", false);


        System.out.println("Der Laprador ist " + laprador.alter + " Jahre alt.");

        dog[] dogs = {laprador, dackel, mops};
        System.out.println("Welche Arten von Hunden gibt es?");
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].art);
        }

        System.out.println("Wie viele Hunde können Pfote geben?");
        int counter = 0;
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].kannPfoteGeben){
                counter++;
            }
        }
        System.out.println(counter);


        //laprador.bellen();
        //laprador.plusRechnen(1, 4);
    }

}