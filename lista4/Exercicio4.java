package lista4;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * Questão 4: Implemente um programa que auxilie os profissionais de química a estimarem a quantidade de substância radioativa que permanece no decorrer do tempo. O usuário deve entrar a quantidade inicial da substância, a taxa de desintegração da substância e o tempo que se passou; e deve apresentar ao usuário a quantidade que ainda sobrou da substância. Utilize a seguinte expressão Q = Qo × e^−rt
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
