//Escreva um programa que receba um número e apresente na tela o dobro deste número.

import javax.swing.JOptionPane;
public class Exercicio6 {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite um número: ");
        int num= Integer.parseInt(num1);
        int dobro = num*2;

        JOptionPane.showMessageDialog(null, "O dobro do número digitado é: " +dobro);
    }
}
