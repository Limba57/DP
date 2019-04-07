package Builder.ExempleBuilderDeux;

public class Phrase {

    public static PhraseBuilder builder() {
        return new PhraseBuilder();
    }

    private final String locale;
    private final String text;

    Phrase(final String locale, final String text) {
        this.locale = locale;
        this.text = text;
    }
}
