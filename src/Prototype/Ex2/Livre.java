package Prototype.Ex2;

public class Livre implements Cloneable{

    private int iDInstance;
    private String titre;
    private String auteur;
    private String resume;

    public Livre (int iDInstance, String titre, String auteur, String resume) {
        this.iDInstance = iDInstance;
        this.titre = titre;
        this.auteur = auteur;
        this.resume = resume;
    }

    public int getiDInstance() {
        return iDInstance;
    }

    public Livre clone() {
        try {
            return (Livre) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setiDInstance(int iDInstance) {
        this.iDInstance = iDInstance;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
