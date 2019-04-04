package Prototype.Ex2;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestNew {

    public static void main(String[] args) {

        long debut = System.currentTimeMillis();

        JSONObject sauvegardeLivre = new JSONObject();

        sauvegardeLivre.put("ID", "1");
        sauvegardeLivre.put("titre", "Elric le necromantien");

        sauvegardeLivre.put("auteur", "Michael Moorcock");
        sauvegardeLivre.put("Resume", "C'est l'histoire d'un mec ...");

        try {
            PrintWriter save = new PrintWriter("Elric.json");
            save.write(sauvegardeLivre.toString());
            save.flush();
            save.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<Livre> listeLivre = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {

            Object obj = null;
            try {
                obj = new JSONParser().parse(new FileReader("Elric.json"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            JSONObject jlivre = (JSONObject) obj;
            int ID = Integer.parseInt((String) jlivre.get("ID"));
            ID += i;
            String titre = (String) jlivre.get("titre");
            String auteur = (String) jlivre.get("auteur");
            String resume = (String) jlivre.get("resume");

            Livre livre = new Livre(ID, titre, auteur, resume);

            listeLivre.add(livre);


        }

        for (Livre l : listeLivre) {
            System.out.println(l.getiDInstance());
        }

        System.out.println((System.currentTimeMillis() - debut)/1000+" secondes");




    }
}
