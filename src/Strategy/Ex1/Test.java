package Strategy.Ex1;

public class Test {

    public static void main(String[] args) {

        SeigneurDeGuerre seigneurDeGuerre = new SeigneurDeGuerre("Attila", Temps.beau);

        seigneurDeGuerre.attaquerChateau();

        seigneurDeGuerre.setTemps(Temps.moche);

        seigneurDeGuerre.attaquerChateau();

    }
}
