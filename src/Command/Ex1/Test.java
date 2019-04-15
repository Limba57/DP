package Command.Ex1;

public class Test {

    public static void main(String[] args) {

        Interrupteur interrupteur = new Interrupteur();
        Lampe lampe = new Lampe();

        Commande allumer = new Allumer(lampe);
        Commande eteindre = new Eteindre(lampe);

        interrupteur.execute(allumer);
        interrupteur.execute(eteindre);

        // on peut enregistrer une suite de commande
        interrupteur.enregistrement(allumer);
        interrupteur.enregistrement(eteindre);

        // et les executer toutes en meme temps
        interrupteur.executeTouteLesActions();
    }
}
