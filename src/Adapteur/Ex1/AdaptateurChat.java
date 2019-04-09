package Adapteur.Ex1;

public class AdaptateurChat implements FaiteDuBruit {

    private Chat chat;

    public AdaptateurChat(Chat chat) {
        this.chat = chat;
    }

    @Override
    public String faireDubruit() {
        return chat.miauler();
    }

    public Chat getChat() {
        return chat;
    }
}
