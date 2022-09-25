//Write a program that receives information (can be text) and displays it on the screen.

import javax.swing.JOptionPane;

public class Exercise4 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, "Nice to meet you, " +nome);
    }
}
