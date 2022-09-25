//Escreva um programa que receba um número inteiro e depois informe se ele é maior o menor que 10.

import javax.swing.JOptionPane;

public class Exercicio8 {
  public static void main(String[] args) {
      String texto1 = JOptionPane.showInputDialog("Insira um número");
      int num1 = Integer.parseInt(texto1);

      if (num1>= 10) {
          JOptionPane.showMessageDialog(null, "O número digitado é maior ou igual a 10");
      }
      else
          JOptionPane.showMessageDialog(null, "O número digitado é menor que 10");
  }
}
