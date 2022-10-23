import javax.swing.JOptionPane;

/**
 * Condicional
 */
public class Exercicio4 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(texto);

        if (numero == 0) {
            JOptionPane.showMessageDialog(null, "O número digitado é nulo");
        }
        else if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número digitado é positivo");
        }
        else{
            JOptionPane.showMessageDialog(null, "O número digitado é negativo");
        }
    }
    
}