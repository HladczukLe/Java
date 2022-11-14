package lista4;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        double popInicial = Double.parseDouble(JOptionPane.showInputDialog("Qual é a população inicial em milhões? "));
        double popEsperada = Double.parseDouble(JOptionPane.showInputDialog("Qual é a população esperada em milhões? "));
        double taxaCrescimento = Double.parseDouble(JOptionPane.showInputDialog("Qual é a taxa de crescimento populacional? "));

        double tempoEstimado = Math.log(popEsperada/popInicial)/Math.log(1+taxaCrescimento);
        JOptionPane.showMessageDialog(null, "A previsão para que a população atinja " +popEsperada+ " milhões de habitantes é de "+new DecimalFormat("0.00").format(tempoEstimado)+ " anos");

    }
}
