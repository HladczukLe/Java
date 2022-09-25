/*Escreva um programa que receba duas informações (podem ser textuais) e as apresente na ordem inversa à sua inserção 
(A que foi inserida por último apareça primeiro).*/

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        String texto1 = JOptionPane.showInputDialog("Digite um número: ");
        String texto2 = JOptionPane.showInputDialog("Digite outro número: ");
        int num1 = Integer.parseInt(texto1);
        int num2 = Integer.parseInt(texto2);
        int subtracao = num1-num2;
        System.out.println("A subtração entre " +num1+ " e " +num2+ " é: " +subtracao);
    }
}
