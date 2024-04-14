package StructuralPatterns.FacadeExercise;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<String> words;

    public Text() {
        words = new ArrayList<>();
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void render() {
        for (String word : words) {
            System.out.println(word + " ");
        }
        System.out.println();
    }
}
