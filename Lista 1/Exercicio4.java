//Escreva um programa que receba uma informação (pode ser textual) e apresente-a na tela do computador.


import javax.swing.JOptionPane;

public class Exercicio4 {
  public static void main(String[] args) {
      String nome = JOptionPane.showInputDialog("Qual seu nome?");
      JOptionPane.showMessageDialog(null, "Prazer em te conhecer, " +nome);
  }
}
