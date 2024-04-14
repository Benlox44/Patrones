package StructuralPatterns.FacadeExercise;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.addWord("This");
        facade.addWord("is");
        facade.addWord("a");
        facade.addWord("test");

        System.out.println("Rendering bold");
        facade.renderBold();

        System.out.println("\nRendering italic");
        facade.renderItalic();

        System.out.println("\nRendering underline");
        facade.renderUnderline();


    }
}
