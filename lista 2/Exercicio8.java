import javax.swing.JOptionPane;

/**
 * Exercicio8
 */
public class Exercicio8 {
    public static void main(String[] args) {
    String selecao = JOptionPane.showInputDialog("Escolha uma opção: \n 1- Cumprimento \n 2-Elogio \n 3-Despedida");
    
    switch (selecao) {
        case "1":
            JOptionPane.showMessageDialog(null, "Bom dia!");
            break;
        case "2":
            JOptionPane.showMessageDialog(null, "Você está de parabéns!");
            break;
        case "3":
            JOptionPane.showMessageDialog(null, "Até breve!");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opção Inválida");
            break;
        }   
    }
}