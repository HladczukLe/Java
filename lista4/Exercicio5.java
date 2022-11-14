package lista4;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * Escreva um programa que auxilie geógrafos a estimarem o tempo que uma determinada população leva para chegar a uma determinada quantidade de habitantes, dado um crescimento populacional. O programa deve receber do usuário a população inicial da cidade (P0), a taxa de crescimento populacional (t) e o tamanho da população que se espera chegar(Px). E então deve calcular quantos anos ele levará para chegar a este tamanho da população (x). Para realizar esta tarefa, é sugerido usar a fórmula: x = log(Px/P0)/log(1 + t)
 */

public class Exercicio5 {
    public static void main(String[] args) {
        double popInicial = Double.parseDouble(JOptionPane.showInputDialog("Qual é a população inicial em milhões? "));
        double popEsperada = Double.parseDouble(JOptionPane.showInputDialog("Qual é a população esperada em milhões? "));
        double taxaCrescimento = Double.parseDouble(JOptionPane.showInputDialog("Qual é a taxa de crescimento populacional? "));

        double tempoEstimado = Math.log(popEsperada/popInicial)/Math.log(1+taxaCrescimento);
        JOptionPane.showMessageDialog(null, "A previsão para que a população atinja " +popEsperada+ " milhões de habitantes é de "+new DecimalFormat("0.00").format(tempoEstimado)+ " anos");

    }
}
