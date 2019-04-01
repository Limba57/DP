package Singleton.Exercice;

import java.io.*;
import java.util.ArrayList;

public class LogBanque {

    private static LogBanque logbanque = new LogBanque();
    private File file;

   private LogBanque() {
       file = new File("historique.txt");
    }

    public static LogBanque getLogbanque() {

        return logbanque;

    }

    public void ecrireLog (String texte){

        FileWriter ecrire = null;
        try {
            ecrire = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter ecrireLigne = new PrintWriter(ecrire);

        ecrireLigne.printf(texte);

        ecrireLigne.close();

    }

    public ArrayList<String> afficherLog() {

        ArrayList<String> liste = null;
        try {
            liste = new ArrayList<>();
            FileReader fichierEnLecture = new FileReader(this.file);
            BufferedReader lecteur = new BufferedReader(fichierEnLecture);
            String ligneEnCour;

            while ((ligneEnCour = lecteur.readLine()) != null) {
                liste.add(ligneEnCour);
            }

            lecteur.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return liste;

    }


}
