package Facade.Ex3;

import java.util.Scanner;

public class CerfaAPL implements Demande{

    private String nom;
    private double salaire;
    private double loyer;
    private Scanner sc;


    public CerfaAPL() {
        formulaire();
    }

    public void formulaire() {

        sc = new Scanner(System.in);

        System.out.println("Demande d'APL, veuillez remplir les champs suivants");
        System.out.println("Veulliez entrer votre nom : ");
        nom = sc.nextLine();

        System.out.println("Veulliez indiquer votre salaire : ");
        salaire = sc.nextDouble();

        System.out.println(("Veuillez indiquer votre loyer : "));
        loyer = sc.nextDouble();

        System.out.println("Voici les informations que vous avez renseigné : ");
        System.out.println("Nom : " + nom);
        System.out.println("Salaire : " + salaire);
        System.out.println("Loyer : " + loyer);

        if (!BoiteAOutils.question("Confirmer")) {
            formulaire();
        } else {
            System.out.println("Données enregistrées");
        }

    }

    @Override
    public Demande demande() {
        return this;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public double getLoyer() {
        return loyer;
    }

}
