package Builder.ExempleBuilderDeux;

public class PhraseBuilder {

    private String locale;
    private String text;

    PhraseBuilder() {

    }

    public PhraseBuilder whithText(final String text) {
        this.text = text;
        return this;
    }

    public PhraseBuilder withLocal(final String local) {
        this.locale = local;
        return this;
    }

    /**
     * Knows Phrase intimately and know safly what
     * the order of parametre in the constructor are
     */
    public Phrase build() {
        return new Phrase(locale, text);
    }
}
