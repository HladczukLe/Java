//Escreva um programa que receba dois números e apresente na tela a diferença (subtração) entre estes números.

import javax.swing.JOptionPane;

public class Exercicio7 {
  public static void main(String[] args) {
      String texto1 = JOptionPane.showInputDialog("Digite um número: ");
      String texto2 = JOptionPane.showInputDialog("Digite outro número: ");
      int num1 = Integer.parseInt(texto1);
      int num2 = Integer.parseInt(texto2);
      int subtracao = num1-num2;
      System.out.println("A subtração entre " +num1+ " e " +num2+ " é: " +subtracao);
  }
}
