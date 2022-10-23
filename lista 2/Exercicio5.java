import javax.swing.JOptionPane;

/**
 * Exercicio5
 */
public class Exercicio5 {
    public static void main(String[] args) {
        String txtNum1 = JOptionPane.showInputDialog("Digite um número:");
        String txtNum2 = JOptionPane.showInputDialog("Digite outro número:");
        int num1 = Integer.parseInt(txtNum1);
        int num2 = Integer.parseInt(txtNum2);
        
        if (num1>num2) {
            JOptionPane.showMessageDialog(null, num2+", "+num1);
        }
        else{
            JOptionPane.showMessageDialog(null, num1+", "+num2);
        }
    }
    
}