package CreationalPatterns.AbstractFactoryExercise;

import javax.swing.JOptionPane;

public class FilePrinter implements IPrinter {

    public FilePrinter(){}

    @Override
    public void print(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
