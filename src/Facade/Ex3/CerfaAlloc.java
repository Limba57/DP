package Facade.Ex3;

import java.util.Scanner;

public class CerfaAlloc implements Demande{

    private String nom;
    private int nbrEnfants;
    private Scanner sc ;

    public CerfaAlloc() {
        formulaire();
    }

    public void formulaire() {

        sc = new Scanner(System.in);

        System.out.println("Demande d'allocation famillial, veuillez remplir les champs suivant");
        System.out.println("Votre nom : ");
        nom = sc.nextLine();

        System.out.println(("Nombre d'enfant à charge : "));
        nbrEnfants = sc.nextInt();

        System.out.println("Voici les informations que vous avez renseigné : ");
        System.out.println("Nom : " + nom);
        System.out.println("Nombre d'enfants : " + nbrEnfants);

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

    public int getNbrEnfants() {
        return nbrEnfants;
    }

}
