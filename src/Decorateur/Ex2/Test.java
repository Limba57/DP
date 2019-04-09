package Decorateur.Ex2;

public class Test {

    public static void main(String[] args) {

        TasDeFeraille twingo = new VoitureEuropeenne("twingo", 2010, 8000);
        System.out.println(twingo.jeSuis());
        twingo = new Climatisation(twingo);
        System.out.println(twingo.jeSuis());
        twingo = new ToitOuvrant(twingo);
        System.out.println(twingo.jeSuis());

        TasDeFeraille corvette = new Climatisation(new ToitOuvrant(new VoitureAmericaine("corvette", 2015, 30000)));
        System.out.println(corvette.jeSuis());
        System.out.println(corvette.jeCoute());

        //TasDeFeraille corvette = new ToitOuvrant();

    }
}
