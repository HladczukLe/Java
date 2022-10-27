import javax.swing.JOptionPane;

/*Questão 8: Escreva um programa que receba um número do usuário em hexadecimal e apresente o núimero em binário. Sugestão: Use classe Wrapper. */


public class Exercicio8 {
    public static void main(String[] args) {
        int hexadecimal = Integer.parseInt(JOptionPane.showInputDialog("Insira um número em hexadecimal: "),16);
        String binario = Integer.toBinaryString(hexadecimal);
        JOptionPane.showMessageDialog(null, "O número hexadecimal "+hexadecimal+ " convertido para binário equivale a "+binario);
    }
}
