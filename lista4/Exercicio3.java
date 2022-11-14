package lista4;
import javax.swing.JOptionPane;

/**
 * Questao 3: Escreva um programa que receba do usuario um caractere e informe se este caractere é uma
letra minúscula, uma letra maiúiscula, um espaço em branco, um digito numérico ou um caractere
especial (algo diferente das opções anteriores).
 */
public class Exercicio3 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite algo: ");
        char caractere = texto.charAt(0);
        if (Character.isLowerCase(caractere)) {
            JOptionPane.showMessageDialog(null, "O primeiro caracter é uma letra minúscula");
        }
        else if (Character.isUpperCase(caractere)) {
            JOptionPane.showMessageDialog(null, "O primeiro caracter é uma letra maiúscula");
        }
        else if (Character.isWhitespace(caractere)) {
            JOptionPane.showMessageDialog(null, "O primeiro caracter é um espaço em branco");
        }
        else if (Character.isDigit(caractere)) {
            JOptionPane.showMessageDialog(null, "O primeiro caracter é um número");
        }
        else {
            JOptionPane.showMessageDialog(null, "O primeiro caracter é um caractere especial");
        }
    }
}