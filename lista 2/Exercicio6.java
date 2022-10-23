import javax.swing.JOptionPane;

/**
 * Exercicio6
 */
public class Exercicio6 {
    public static void main(String[] args) {
        String txtNum = JOptionPane.showInputDialog("Insira um número: ");
        int num = Integer.parseInt(txtNum);

        if (num%2==0) {
            JOptionPane.showMessageDialog(null, "O número "+num+" é par");
        }
        else{
            JOptionPane.showMessageDialog(null, "O número "+num+" é ímpar");
        }
    }
    
}