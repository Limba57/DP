package Adapteur.Ex1;

public class Test {


    public static void main(String[] args) {

        Chien chien = new Chien("medor");
        Chat chat = new Chat("pelotte");

        AdaptateurChat pelotte = new AdaptateurChat(chat);

        AdaptateurChien medor = new AdaptateurChien(chien);

        System.out.println(pelotte.getChat().getNom()+" "+pelotte.faireDubruit());
        System.out.println(medor.getChien().getNom()+" "+medor.faireDubruit());


    }
}
