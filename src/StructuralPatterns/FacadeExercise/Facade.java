package StructuralPatterns.FacadeExercise;

public class Facade {
    private Text text;
    private BoldStyle boldStyle;
    private UnderlineStyle underlineStyle;
    private ItalicStyle italicStyle;

    public Facade() {
        text = new Text();
        boldStyle = new BoldStyle();
        underlineStyle = new UnderlineStyle();
        italicStyle = new ItalicStyle();
    }

    public void addWord(String word) {
        text.addWord(word);
    }

    public void renderBold() {
        boldStyle.applyStyle();
        text.render();
        boldStyle.render();
    }

    public void renderUnderline() {
        underlineStyle.applyStyle();
        text.render();
        underlineStyle.render();
    }

    public void renderItalic() {
        italicStyle.applyStyle();
        text.render();
        italicStyle.render();
    }
}