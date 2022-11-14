package lista4;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * Exercicio4
 */
public class Exercicio4 {
    public static void main(String[] args) {
        double massaInicial = Double.parseDouble(JOptionPane.showInputDialog("Qual é a massa inicial? "));
        double taxa = Double.parseDouble(JOptionPane.showInputDialog("Qual é a taxa de variação? "));
        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Quantos anos? "));
        double euler = Math.exp(taxa*tempo*(-1));
        double massaFinal = massaInicial*euler;
        JOptionPane.showMessageDialog(null,"A massa final da substância é de: "+new DecimalFormat("0.00").format(massaFinal)+"g");
    }
    
}