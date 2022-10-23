import javax.swing.JOptionPane;

/**
 * Exercicio3
 */
public class Exercicio3 {
    public static void main(String[] args) {
        String txtNum1 = JOptionPane.showInputDialog("Digite um número: ");
        String txtNum2 = JOptionPane.showInputDialog("Digite outro número: ");
        float num1 = Float.parseFloat(txtNum1);
        float num2 = Float.parseFloat(txtNum2);
        float soma = num1+num2;
        float subtracao = num1-num2;
        float produto = num1*num2;
        float razao = num1/num2;

        JOptionPane.showMessageDialog(null, soma);
        JOptionPane.showMessageDialog(null, subtracao);
        JOptionPane.showMessageDialog(null, produto);
        JOptionPane.showMessageDialog(null, razao);
    }
    
}