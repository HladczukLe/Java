//Escreva um programa que receba dois números inteiros e depois informe se a diferença entre os dois é maior ou menor que 10.

import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        String text1 = JOptionPane.showInputDialog("Digite um número: ");
        String text2 = JOptionPane.showInputDialog("Digite um número: ");
        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);
        int subtracao = num1-num2;

        if (subtracao>=10) {
            JOptionPane.showMessageDialog(null, "A diferença entre os números é maior que 10");
        }
        else{
            JOptionPane.showMessageDialog(null, "A diferença entre os números é menor que 10");

        }
    }
    
}
