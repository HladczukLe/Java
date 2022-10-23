package Lista2;

import javax.swing.JOptionPane;

/**
 * Exercicio9
 */
public class Exercicio9 {
    public static void main(String[] args) {
      int selecao;
    do{
      selecao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n1-Cumprimento \n2-Elogio \n3-Despedida \n4-Sair"));
      if (selecao == 1) {
        JOptionPane.showMessageDialog(null, "Bom dia!");
      } 
      else if (selecao == 2) {
        JOptionPane.showMessageDialog(null, "Você está de parabéns!");
      }
      else if (selecao == 3) {
        JOptionPane.showMessageDialog(null, "Até breve!");
      }
      else if(selecao>4){
        JOptionPane.showMessageDialog(null, "Opção Inválida");
      }
    } while (selecao != 4);
    }
}